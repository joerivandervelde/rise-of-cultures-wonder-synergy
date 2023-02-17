package nl.joerivandervelde.rocsyncalc.synergy;

import java.util.ArrayList;

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
        for(BonusCounts bonusCount : highestOverall)
        {
            sb.append(" * " + bonusCount + System.lineSeparator());
        }
        sb.append(System.lineSeparator());

        sb.append("Highest overall economy (" + highestEconomy.get(0).economy + ") for:" + System.lineSeparator());
        for(BonusCounts bonusCount : highestEconomy)
        {
            sb.append(" * " + bonusCount + System.lineSeparator());
        }
        sb.append(System.lineSeparator());

        sb.append("Highest overall military (" + highestMilitary.get(0).military + ") for:" + System.lineSeparator());
        for(BonusCounts bonusCount : highestMilitary)
        {
            sb.append(" * " + bonusCount + System.lineSeparator());
        }
        sb.append(System.lineSeparator());

        sb.append("Highest overall research (" + highestResearch.get(0).research + ") for:" + System.lineSeparator());
        for(BonusCounts bonusCount : highestResearch)
        {
            sb.append(" * " + bonusCount + System.lineSeparator());
        }
        sb.append(System.lineSeparator());

        return sb.toString();
    }
}
