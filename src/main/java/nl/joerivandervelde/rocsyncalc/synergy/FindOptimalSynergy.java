package nl.joerivandervelde.rocsyncalc.synergy;

import nl.joerivandervelde.rocsyncalc.wonder.Wonder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOptimalSynergy {

    private Synergy synergyCounts;

    public Synergy iterateOver(List<Wonder[]> allCapCityWonderSubsets, List<Wonder[]> allAlliedCultSubsets)
    {
        for(Wonder[] ancientWorldWonderSubset : allCapCityWonderSubsets)
        {
            for(Wonder[] greatEmpiresWonderSubset : allAlliedCultSubsets)
            {
                Wonder[] result = Arrays.copyOf(ancientWorldWonderSubset, ancientWorldWonderSubset.length + greatEmpiresWonderSubset.length);
                System.arraycopy(greatEmpiresWonderSubset, 0, result, ancientWorldWonderSubset.length, greatEmpiresWonderSubset.length);
                BonusCounts bonusCounts = calculateSynergies(result);
                assignHighest(bonusCounts);
            }
        }
        return synergyCounts;
    }

    public void assignHighest(BonusCounts bonusCounts){
        if(synergyCounts == null)
        {
            this.synergyCounts = new Synergy();
            synergyCounts.setHighestOverall(new ArrayList<>(List.of(bonusCounts)));
            synergyCounts.setHighestEconomy(new ArrayList<>(List.of(bonusCounts)));
            synergyCounts.setHighestMilitary(new ArrayList<>(List.of(bonusCounts)));
            synergyCounts.setHighestResearch(new ArrayList<>(List.of(bonusCounts)));
            return;
        }

        int totalSyn = totalSynergy(bonusCounts);
        int highestTotalSynergySoFar = totalSynergy(synergyCounts.getHighestOverall().get(0));

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

    public BonusCounts calculateSynergies(Wonder[] wonders)
    {
        BonusCounts bonusCounts = new BonusCounts();
        bonusCounts.forWonders = wonders;
        for(Wonder wonder : wonders)
        {
            addBonusCountsForWonder(bonusCounts, wonder);
            for(Wonder compareAgainst : wonders)
            {
                if(wonder.equals(compareAgainst))
                {
                    continue;
                }
                addBoostedBonusCountsForWonder(bonusCounts, wonder, compareAgainst);
            }
        }
        return bonusCounts;
    }

    public static int totalSynergy(BonusCounts bonusCounts)
    {
        return bonusCounts.economy + bonusCounts.military + bonusCounts.research;
    }

    public void addBonusCountsForWonder(BonusCounts bonusCounts, Wonder wonder) {
        switch (wonder.getBonusOne()) {
            case ECONOMY -> bonusCounts.economy++;
            case MILITARY -> bonusCounts.military++;
            case RESEARCH -> bonusCounts.research++;
        }
        switch (wonder.getBonusTwo()) {
            case ECONOMY -> bonusCounts.economy++;
            case MILITARY -> bonusCounts.military++;
            case RESEARCH -> bonusCounts.research++;
        }
    }

    public void addBoostedBonusCountsForWonder(BonusCounts bonusCounts, Wonder wonder, Wonder compareAgainst) {
        if(compareAgainst.getWonderType().contains(wonder.getBoostedByType())){
            switch (wonder.getBoosted()) {
                case ECONOMY -> bonusCounts.economy++;
                case MILITARY -> bonusCounts.military++;
                case RESEARCH -> bonusCounts.research++;
            }
        }
    }
}
