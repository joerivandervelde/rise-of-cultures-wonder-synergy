package nl.joerivandervelde.rocsyncalc;

import nl.joerivandervelde.rocsyncalc.wonderprops.WonderLocation;

import java.util.*;

import static nl.joerivandervelde.rocsyncalc.wonderprops.Bonus.*;
import static nl.joerivandervelde.rocsyncalc.wonderprops.WonderAge.ANCIENT_WORLD;
import static nl.joerivandervelde.rocsyncalc.wonderprops.WonderAge.GREAT_EMPIRES;
import static nl.joerivandervelde.rocsyncalc.wonderprops.WonderLocation.ALLIED_CULTURES;
import static nl.joerivandervelde.rocsyncalc.wonderprops.WonderLocation.CAPITAL_CITY;
import static nl.joerivandervelde.rocsyncalc.wonderprops.WonderType.*;

public class DefineWonders {

    private List<Wonder> allWonders;
    private Map<String, Wonder> allWondersByName;

    public DefineWonders()
    {
        this.allWonders = new ArrayList<>();
        this.allWondersByName = new HashMap<>();
        Wonder templeOfArtemis = new Wonder("Temple of Artemis", CAPITAL_CITY, ANCIENT_WORLD, new HashSet<>(Arrays.asList(TEMPLE)), STATUE, MILITARY, ECONOMY, MILITARY);
        Wonder stonehenge = new Wonder("Stonehenge", CAPITAL_CITY, ANCIENT_WORLD, new HashSet<>(Arrays.asList(TEMPLE, STATUE)), TEMPLE, ECONOMY, RESEARCH, RESEARCH);
        Wonder hangingGardens = new Wonder("Hanging Gardens", CAPITAL_CITY, ANCIENT_WORLD, new HashSet<>(Arrays.asList(NATURE, PALACE)), PALACE, ECONOMY, ECONOMY, ECONOMY);
        Wonder statueOfZeus = new Wonder("Statue of Zeus", CAPITAL_CITY, ANCIENT_WORLD, new HashSet<>(Arrays.asList(STATUE)), STATUE, MILITARY, NONE, MILITARY);
        Wonder cheopsPyramid = new Wonder("Cheops Pyramid", ALLIED_CULTURES, ANCIENT_WORLD, new HashSet<>(Arrays.asList(TEMPLE)), TEMPLE, ECONOMY, ECONOMY, ECONOMY);
        Wonder greatSphinx = new Wonder("Great Sphinx", ALLIED_CULTURES, ANCIENT_WORLD, new HashSet<>(Arrays.asList(STATUE)), STATUE, MILITARY, ECONOMY, MILITARY);
        Wonder abuSimbel = new Wonder("Abu Simbel", ALLIED_CULTURES, ANCIENT_WORLD, new HashSet<>(Arrays.asList(PALACE)), PALACE, MILITARY, RESEARCH, RESEARCH);
        Wonder tombOfMausolus = new Wonder("Tomb of Mausolus", CAPITAL_CITY, ANCIENT_WORLD, new HashSet<>(Arrays.asList(TEMPLE)), TEMPLE, ECONOMY, ECONOMY, ECONOMY);
        Wonder lighthouseOfAlexandria = new Wonder("Lighthouse of Alexandria", CAPITAL_CITY, ANCIENT_WORLD, new HashSet<>(Arrays.asList(NAVAL, TEMPLE)), NAVAL, ECONOMY, ECONOMY, ECONOMY);
        Wonder hagiaSophia = new Wonder("Hagia Sophia", CAPITAL_CITY, GREAT_EMPIRES, new HashSet<>(Arrays.asList(TEMPLE)), EMPTY, RESEARCH, ECONOMY, NONE);
        Wonder colosseum = new Wonder("Colosseum", CAPITAL_CITY, GREAT_EMPIRES, new HashSet<>(Arrays.asList(ARENA, FORTRESS)), STATUE, MILITARY, ECONOMY, MILITARY);
        Wonder palaceOfAachen = new Wonder("Palace of Aachen", CAPITAL_CITY, GREAT_EMPIRES, new HashSet<>(Arrays.asList(FORTRESS, PALACE)), FORTRESS, MILITARY, MILITARY, MILITARY);
        Wonder sherwoodForest = new Wonder("Sherwood Forest", CAPITAL_CITY, GREAT_EMPIRES, new HashSet<>(Arrays.asList(FORTRESS, NATURE)), FORTRESS, MILITARY, RESEARCH, MILITARY);
        Wonder terracottaArmy = new Wonder("Terracotta Army", ALLIED_CULTURES, GREAT_EMPIRES, new HashSet<>(Arrays.asList(FORTRESS, STATUE)), FORTRESS, MILITARY, MILITARY, MILITARY);
        Wonder forbiddenCity = new Wonder("Forbidden City", ALLIED_CULTURES, GREAT_EMPIRES, new HashSet<>(Arrays.asList(PALACE, TEMPLE)), TEMPLE, ECONOMY, ECONOMY, ECONOMY);
        Wonder greatWall = new Wonder("Great Wall", ALLIED_CULTURES, GREAT_EMPIRES, new HashSet<>(Arrays.asList(FORTRESS)), FORTRESS, MILITARY, RESEARCH, RESEARCH);
        Wonder sayilPalace = new Wonder("Sayil Palace", ALLIED_CULTURES, GREAT_EMPIRES, new HashSet<>(Arrays.asList(FORTRESS, PALACE)), FORTRESS, MILITARY, MILITARY, MILITARY);
        Wonder chichenItza = new Wonder("Chichen Itza", ALLIED_CULTURES, GREAT_EMPIRES, new HashSet<>(Arrays.asList(TEMPLE, ARENA)), ARENA, MILITARY, MILITARY, MILITARY);
        this.allWonders.add(templeOfArtemis);
        this.allWonders.add(stonehenge);
        this.allWonders.add(hangingGardens);
        this.allWonders.add(statueOfZeus);
        this.allWonders.add(cheopsPyramid);
        this.allWonders.add(greatSphinx);
        this.allWonders.add(abuSimbel);
        this.allWonders.add(tombOfMausolus);
        this.allWonders.add(lighthouseOfAlexandria);
        this.allWonders.add(hagiaSophia);
        this.allWonders.add(colosseum);
        this.allWonders.add(palaceOfAachen);
        this.allWonders.add(sherwoodForest);
        this.allWonders.add(terracottaArmy);
        this.allWonders.add(forbiddenCity);
        this.allWonders.add(greatWall);
        this.allWonders.add(sayilPalace);
        this.allWonders.add(chichenItza);
        for(Wonder w : allWonders)
        {
            allWondersByName.put(w.getName(), w);
        }
    }

    public Map<String, Wonder> getAllWondersByName() {
        return allWondersByName;
    }

    public List<Wonder> getAllWonders() {
        return this.allWonders;
    }

    public Wonder[] getWorldWondersFromLocation(WonderLocation wonderLocation){
        List<Wonder> wondersList = new ArrayList<>();
        for(Wonder wonder : this.allWonders)
        {
            if(wonder.getWonderLocation().equals(wonderLocation))
            {
                wondersList.add(wonder);
            }
        }
        return wondersList.toArray(new Wonder[0]);
    }

    public void removeBadBonuses()
    {
        // Boosts the Hit Points of all of your Bastion Units
        this.allWondersByName.get("Sayil Palace").setBonusOne(NONE);
        // Produces a Mystery Chest which can include the Mercenary Commander King Pakal in 1d
        this.allWondersByName.get("Sayil Palace").setBonusOne(NONE);
        // Boosts the Damage of all of your Bastion Units by 2.0% extra per every other active Fortress
        this.allWondersByName.get("Sayil Palace").setBoosted(NONE);

        // Produces a Mystery Chest which can include the Mercenary Commander Emperor Qin in 1d
        this.allWondersByName.get("Terracotta Army").setBonusTwo(NONE);

        // Boosts the Hit Points of all of your Ranged Units
        this.allWondersByName.get("Sherwood Forest").setBonusTwo(NONE);
        // Boosts the Hit Points of all of your Ranged Units by 2.0% extra per every other active Fortress
        this.allWondersByName.get("Sherwood Forest").setBoosted(NONE);

    }
}
