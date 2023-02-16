package nl.joerivandervelde.rocsyncalc;

import nl.joerivandervelde.rocsyncalc.wonderprops.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * WonderSynergiesCalculator
 */
public class WonderSynergiesCalculator {

    private ArrayList<BonusCounts> highestOverall;
    private ArrayList<BonusCounts> highestEconomy;
    private ArrayList<BonusCounts> highestMilitary;
    private ArrayList<BonusCounts> highestResearch;

    public static void main(String[] args) {
        WonderSynergiesCalculator wsc = new WonderSynergiesCalculator();
        wsc.go();
    }

    public void go()
    {
        DefineWonders defineWonders = new DefineWonders();

        Wonder[] allCapCityWonders = defineWonders.getWorldWondersFromLocation(WonderLocation.CAPITAL_CITY);
        List<Wonder[]> allCapCityWonderSubsets = subset(4, allCapCityWonders);

        Wonder[] allAlliedCultWonders = defineWonders.getWorldWondersFromLocation(WonderLocation.ALLIED_CULTURES);
        List<Wonder[]> allAlliedCultSubsets = subset(4, allAlliedCultWonders);

        iterateOverAllCombinations(allCapCityWonderSubsets, allAlliedCultSubsets);
        defineWonders.removeBadBonuses();
        iterateOverAllCombinations(allCapCityWonderSubsets, allAlliedCultSubsets);

    }

    public void iterateOverAllCombinations(List<Wonder[]> allCapCityWonderSubsets, List<Wonder[]> allAlliedCultSubsets)
    {
        highestOverall = null;
        highestEconomy = null;
        highestMilitary = null;
        highestResearch = null;
        int counter = 0;
        for(Wonder[] ancientWorldWonderSubset : allCapCityWonderSubsets)
        {
            for(Wonder[] greatEmpiresWonderSubset : allAlliedCultSubsets)
            {
                Wonder[] result = Arrays.copyOf(ancientWorldWonderSubset, ancientWorldWonderSubset.length + greatEmpiresWonderSubset.length);
                System.arraycopy(greatEmpiresWonderSubset, 0, result, ancientWorldWonderSubset.length, greatEmpiresWonderSubset.length);
                BonusCounts bonusCounts = calculateSynergies(result);
                assignHighest(bonusCounts);
                counter++;
            }
        }
        System.out.println("checked " + counter + " unique wonder combinations");
        System.out.println("highester overall synergy = " + highestOverall);
        System.out.println("eco = " + highestEconomy);
        System.out.println("mil = " + highestMilitary);
        System.out.println("res = " + highestResearch);
    }

    public void assignHighest(BonusCounts bonusCounts){
        if(highestOverall == null)
        {
            highestOverall = new ArrayList<>(List.of(bonusCounts));
            highestEconomy = new ArrayList<>(List.of(bonusCounts));
            highestMilitary = new ArrayList<>(List.of(bonusCounts));
            highestResearch = new ArrayList<>(List.of(bonusCounts));
            return;
        }

        int totalSyn = totalSynergy(bonusCounts);
        int highestTotalSynergySoFar = totalSynergy(highestOverall.get(0));
        if(totalSyn > highestTotalSynergySoFar)
        {
            highestOverall = new ArrayList<>(List.of(bonusCounts));
        }
        else if(totalSyn == highestTotalSynergySoFar)
        {
            highestOverall.add(bonusCounts);
        }

        if(bonusCounts.economy > highestEconomy.get(0).economy)
        {
            highestEconomy = new ArrayList<>(List.of(bonusCounts));
        }
        else if(bonusCounts.economy == highestEconomy.get(0).economy)
        {
            highestEconomy.add(bonusCounts);
        }

        if(bonusCounts.military > highestMilitary.get(0).military)
        {
            highestMilitary = new ArrayList<>(List.of(bonusCounts));
        }
        else if(bonusCounts.military == highestMilitary.get(0).military)
        {
            highestMilitary.add(bonusCounts);
        }

        if(bonusCounts.research > highestResearch.get(0).research)
        {
            highestResearch = new ArrayList<>(List.of(bonusCounts));
        }
        else if(bonusCounts.research == highestResearch.get(0).research){
            highestResearch.add(bonusCounts);
        }


    }

    public int totalSynergy(BonusCounts bonusCounts)
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

    /**
     * From https://stackoverflow.com/questions/29910312/algorithm-to-get-all-the-combinations-of-size-n-from-an-array-java
     */
    public List<Wonder[]> subset(int k, Wonder[] input)
    {
        List<Wonder[]> subsets = new ArrayList<>();

        int[] s = new int[k];                  // here we'll keep indices
        // pointing to elements in input array

        if (k <= input.length) {
            // first index sequence: 0, 1, 2, ...
            for (int i = 0; (s[i] = i) < k - 1; i++);
            subsets.add(getSubset(input, s));
            for(;;) {
                int i;
                // find position of item that can be incremented
                for (i = k - 1; i >= 0 && s[i] == input.length - k + i; i--);
                if (i < 0) {
                    break;
                }
                s[i]++;                    // increment this item
                for (++i; i < k; i++) {    // fill up remaining items
                    s[i] = s[i - 1] + 1;
                }
                subsets.add(getSubset(input, s));
            }
        }
        return subsets;
    }

    // generate actual subset by index sequence
    Wonder[] getSubset(Wonder[] input, int[] subset) {
        Wonder[] result = new Wonder[subset.length];
        for (int i = 0; i < subset.length; i++)
            result[i] = input[subset[i]];
        return result;
    }

}
