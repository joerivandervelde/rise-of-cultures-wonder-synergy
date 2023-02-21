package nl.joerivandervelde.rocsyncalc.synergy;

import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.table.TableRow;

import java.util.ArrayList;
import java.util.Arrays;

import static nl.joerivandervelde.rocsyncalc.synergy.FindOptimalSynergy.totalSynergy;

public class Synergy {

    private ArrayList<BonusCounts> highestOverall;
    private ArrayList<BonusCounts> highestEconomy;
    private ArrayList<BonusCounts> highestMilitary;
    private ArrayList<BonusCounts> highestResearch;

    public ArrayList<BonusCounts> getHighestOverall() {
        return highestOverall;
    }

    public void setHighestOverall(ArrayList<BonusCounts> highestOverall) {
        this.highestOverall = highestOverall;
    }

    public ArrayList<BonusCounts> getHighestEconomy() {
        return highestEconomy;
    }

    public void setHighestEconomy(ArrayList<BonusCounts> highestEconomy) {
        this.highestEconomy = highestEconomy;
    }

    public ArrayList<BonusCounts> getHighestMilitary() {
        return highestMilitary;
    }

    public void setHighestMilitary(ArrayList<BonusCounts> highestMilitary) {
        this.highestMilitary = highestMilitary;
    }

    public ArrayList<BonusCounts> getHighestResearch() {
        return highestResearch;
    }

    public void setHighestResearch(ArrayList<BonusCounts> highestResearch) {
        this.highestResearch = highestResearch;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Highest total synergy (" + totalSynergy(highestOverall.get(0)) + ") for:" + System.lineSeparator());
        buildTableFor(sb, highestOverall);

        sb.append("Highest overall economy (" + highestEconomy.get(0).economy + ") for:" + System.lineSeparator());
        buildTableFor(sb, highestEconomy);

        sb.append("Highest overall military (" + highestMilitary.get(0).military + ") for:" + System.lineSeparator());
        buildTableFor(sb, highestMilitary);

        sb.append("Highest overall research (" + highestResearch.get(0).research + ") for:" + System.lineSeparator());
        buildTableFor(sb, highestResearch);

        return sb.toString();
    }

    private void buildTableFor(StringBuilder sb, ArrayList<BonusCounts> bonusCounts)
    {
        Table.Builder tableBuilder = new Table.Builder();
        tableBuilder.addRow(tableHeader());
        for(BonusCounts bonusCount : bonusCounts)
        {
            tableBuilder.addRow(bonusCount.asRow());
        }
        sb.append(tableBuilder.build());
        sb.append(System.lineSeparator());
        sb.append(System.lineSeparator());
    }

    private TableRow tableHeader()
    {
        TableRow<String> tableRow = new TableRow<>();
        tableRow.setColumns(Arrays.asList("Economy", "Military", "Research", "Wonder 1", "Wonder 2", "Wonder 3", "Wonder 4", "Wonder 5", "Wonder 6", "Wonder 7", "Wonder 8"));
        return tableRow;
    }
}
