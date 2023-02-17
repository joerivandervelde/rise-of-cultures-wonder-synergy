package nl.joerivandervelde.rocsyncalc;

import nl.joerivandervelde.rocsyncalc.synergy.FindOptimalSynergy;
import nl.joerivandervelde.rocsyncalc.synergy.Synergy;
import nl.joerivandervelde.rocsyncalc.wonder.Wonder;
import nl.joerivandervelde.rocsyncalc.wonder.WonderInstances;

import java.util.List;

import static nl.joerivandervelde.rocsyncalc.synergy.SubsetCombinations.subset;
import static nl.joerivandervelde.rocsyncalc.wonder.properties.WonderLocation.ALLIED_CULTURES;
import static nl.joerivandervelde.rocsyncalc.wonder.properties.WonderLocation.CAPITAL_CITY;

/**
 * Calculate wonder synergy by checking all wonder combinations
 */
public class OptimalWonderSynergy {

    public void go()
    {
        WonderInstances wonders = new WonderInstances();

        Wonder[] capitalCityWonders = wonders.getWondersForLocation(CAPITAL_CITY);
        Wonder[] alliedCulturesWonders = wonders.getWondersForLocation(ALLIED_CULTURES);

        List<Wonder[]> allCapitalCityWonderSubsets = subset(4, capitalCityWonders);
        List<Wonder[]> allAlliedCulturesWonderSubsets = subset(4, alliedCulturesWonders);

        Synergy synergy = new FindOptimalSynergy().iterateOver(allCapitalCityWonderSubsets, allAlliedCulturesWonderSubsets);
        System.out.println(synergy);

        System.out.println("Removing bad bonuses and recalculating..." + System.lineSeparator());
        wonders.removeBadBonuses();

        Synergy synergyAfter = new FindOptimalSynergy().iterateOver(allCapitalCityWonderSubsets, allAlliedCulturesWonderSubsets);
        System.out.println(synergyAfter);
    }
}
