package nl.joerivandervelde.rocsyncalc.synergy;

import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.table.TableRow;

import java.util.ArrayList;
import java.util.Arrays;

import static nl.joerivandervelde.rocsyncalc.synergy.FindHighestBonusCombinations.totalBonuses;

public class HighestBonuses {

    private ArrayList<Bonuses> highestOverall;
    private ArrayList<Bonuses> highestEconomy;
    private ArrayList<Bonuses> highestMilitary;
    private ArrayList<Bonuses> highestResearch;

    public ArrayList<Bonuses> getHighestOverall() {
        return highestOverall;
    }

    public void setHighestOverall(ArrayList<Bonuses> highestOverall) {
        this.highestOverall = highestOverall;
    }

    public ArrayList<Bonuses> getHighestEconomy() {
        return highestEconomy;
    }

    public void setHighestEconomy(ArrayList<Bonuses> highestEconomy) {
        this.highestEconomy = highestEconomy;
    }

    public ArrayList<Bonuses> getHighestMilitary() {
        return highestMilitary;
    }

    public void setHighestMilitary(ArrayList<Bonuses> highestMilitary) {
        this.highestMilitary = highestMilitary;
    }

    public ArrayList<Bonuses> getHighestResearch() {
        return highestResearch;
    }

    public void setHighestResearch(ArrayList<Bonuses> highestResearch) {
        this.highestResearch = highestResearch;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Highest overall bonuses (" + totalBonuses(highestOverall.get(0)) + ") for:" + System.lineSeparator());
        buildTableFor(sb, highestOverall);

        sb.append("Highest economy bonuses (" + highestEconomy.get(0).economy + ") for:" + System.lineSeparator());
        buildTableFor(sb, highestEconomy);

        sb.append("Highest military bonuses (" + highestMilitary.get(0).military + ") for:" + System.lineSeparator());
        buildTableFor(sb, highestMilitary);

        sb.append("Highest research bonuses (" + highestResearch.get(0).research + ") for:" + System.lineSeparator());
        buildTableFor(sb, highestResearch);

        return sb.toString();
    }

    private void buildTableFor(StringBuilder sb, ArrayList<Bonuses> bonusCounts)
    {
        Table.Builder tableBuilder = new Table.Builder();
        tableBuilder.addRow(tableHeader());
        for(Bonuses bonusCount : bonusCounts)
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
