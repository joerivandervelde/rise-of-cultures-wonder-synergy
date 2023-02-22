package nl.joerivandervelde.rocsyncalc.synergy;

import nl.joerivandervelde.rocsyncalc.wonder.Wonder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindHighestBonusCombinations {

    private HighestBonuses synergyCounts;

    public HighestBonuses iterateOverWonderSetCombinations(List<Wonder[]> allCapCityWonderSubsets, List<Wonder[]> allAlliedCultSubsets)
    {
        for(Wonder[] ancientWorldWonderSubset : allCapCityWonderSubsets)
        {
            for(Wonder[] greatEmpiresWonderSubset : allAlliedCultSubsets)
            {
                Wonder[] result = Arrays.copyOf(ancientWorldWonderSubset, ancientWorldWonderSubset.length + greatEmpiresWonderSubset.length);
                System.arraycopy(greatEmpiresWonderSubset, 0, result, ancientWorldWonderSubset.length, greatEmpiresWonderSubset.length);
                Bonuses bonusCounts = countAllBonusesForAllCombinations(result);
                keepTrackOfHighestBonuses(bonusCounts);
            }
        }
        return synergyCounts;
    }

    public void keepTrackOfHighestBonuses(Bonuses bonusCounts){
        if(synergyCounts == null)
        {
            this.synergyCounts = new HighestBonuses();
            synergyCounts.setHighestOverall(new ArrayList<>(List.of(bonusCounts)));
            synergyCounts.setHighestEconomy(new ArrayList<>(List.of(bonusCounts)));
            synergyCounts.setHighestMilitary(new ArrayList<>(List.of(bonusCounts)));
            synergyCounts.setHighestResearch(new ArrayList<>(List.of(bonusCounts)));
            return;
        }

        int totalSyn = totalBonuses(bonusCounts);
        int highestTotalSynergySoFar = totalBonuses(synergyCounts.getHighestOverall().get(0));

        if(totalSyn > highestTotalSynergySoFar)
        {
            synergyCounts.setHighestOverall(new ArrayList<>(List.of(bonusCounts)));
        }
        else if(totalSyn == highestTotalSynergySoFar)
        {
            synergyCounts.getHighestOverall().add(bonusCounts);
        }

        if(bonusCounts.economy > synergyCounts.getHighestEconomy().get(0).economy)
        {
            synergyCounts.setHighestEconomy(new ArrayList<>(List.of(bonusCounts)));
        }
        else if(bonusCounts.economy == synergyCounts.getHighestEconomy().get(0).economy)
        {
            synergyCounts.getHighestEconomy().add(bonusCounts);
        }

        if(bonusCounts.military > synergyCounts.getHighestMilitary().get(0).military)
        {
            synergyCounts.setHighestMilitary(new ArrayList<>(List.of(bonusCounts)));
        }
        else if(bonusCounts.military == synergyCounts.getHighestMilitary().get(0).military)
        {
            synergyCounts.getHighestMilitary().add(bonusCounts);
        }

        if(bonusCounts.research > synergyCounts.getHighestResearch().get(0).research)
        {
            synergyCounts.setHighestResearch(new ArrayList<>(List.of(bonusCounts)));
        }
        else if(bonusCounts.research == synergyCounts.getHighestResearch().get(0).research){
            synergyCounts.getHighestResearch().add(bonusCounts);
        }
    }

    public Bonuses countAllBonusesForAllCombinations(Wonder[] wonders)
    {
        Bonuses bonusCounts = new Bonuses();
        bonusCounts.forWonders = wonders;
        for(Wonder wonder : wonders)
        {
            addSelfBonusesForWonder(bonusCounts, wonder);
            for(Wonder compareAgainst : wonders)
            {
                if(wonder.equals(compareAgainst))
                {
                    continue;
                }
                addSynergyBonusesForWonder(bonusCounts, wonder, compareAgainst);
            }
        }
        return bonusCounts;
    }

    public static int totalBonuses(Bonuses bonusCounts)
    {
        return bonusCounts.economy + bonusCounts.military + bonusCounts.research;
    }

    public void addSelfBonusesForWonder(Bonuses bonusCounts, Wonder wonder) {
        switch (wonder.getSelfBonusOne()) {
            case ECONOMY -> bonusCounts.economy++;
            case MILITARY -> bonusCounts.military++;
            case RESEARCH -> bonusCounts.research++;
        }
        switch (wonder.getSelfBonusTwo()) {
            case ECONOMY -> bonusCounts.economy++;
            case MILITARY -> bonusCounts.military++;
            case RESEARCH -> bonusCounts.research++;
        }
    }

    public void addSynergyBonusesForWonder(Bonuses bonusCounts, Wonder wonder, Wonder compareAgainst) {
        if(compareAgainst.getWonderType().contains(wonder.getSynergizedByType())){
            switch (wonder.getSynergyBonus()) {
                case ECONOMY -> bonusCounts.economy++;
                case MILITARY -> bonusCounts.military++;
                case RESEARCH -> bonusCounts.research++;
            }
        }
    }
}
