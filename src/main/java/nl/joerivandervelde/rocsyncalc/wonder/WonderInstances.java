package nl.joerivandervelde.rocsyncalc.wonder;

import nl.joerivandervelde.rocsyncalc.wonder.properties.WonderLocation;

import java.util.*;

import static nl.joerivandervelde.rocsyncalc.wonder.properties.Bonus.*;
import static nl.joerivandervelde.rocsyncalc.wonder.properties.WonderAge.*;
import static nl.joerivandervelde.rocsyncalc.wonder.properties.WonderLocation.ALLIED_CULTURES;
import static nl.joerivandervelde.rocsyncalc.wonder.properties.WonderLocation.CAPITAL_CITY;
import static nl.joerivandervelde.rocsyncalc.wonder.properties.WonderType.*;

public class WonderInstances {

    private List<Wonder> allWonders;
    private Map<String, Wonder> allWondersByName;

    public WonderInstances()
    {
        this.allWonders = new ArrayList<>();
        this.allWonders.add(new Wonder("Temple of Artemis", CAPITAL_CITY, ANCIENT_WORLD, new ArrayList<>(Arrays.asList(TEMPLE)), STATUE, MILITARY, ECONOMY, MILITARY));
        this.allWonders.add(new Wonder("Stonehenge", CAPITAL_CITY, ANCIENT_WORLD, new ArrayList<>(Arrays.asList(TEMPLE, STATUE)), TEMPLE, ECONOMY, RESEARCH, RESEARCH));
        this.allWonders.add(new Wonder("Hanging Gardens", CAPITAL_CITY, ANCIENT_WORLD, new ArrayList<>(Arrays.asList(NATURE, PALACE)), PALACE, ECONOMY, ECONOMY, ECONOMY));
        this.allWonders.add(new Wonder("Statue of Zeus", CAPITAL_CITY, ANCIENT_WORLD, new ArrayList<>(Arrays.asList(STATUE)), STATUE, MILITARY, NONE, MILITARY));
        this.allWonders.add(new Wonder("Cheops Pyramid", ALLIED_CULTURES, ANCIENT_WORLD, new ArrayList<>(Arrays.asList(TEMPLE)), TEMPLE, ECONOMY, ECONOMY, ECONOMY));
        this.allWonders.add(new Wonder("Great Sphinx", ALLIED_CULTURES, ANCIENT_WORLD, new ArrayList<>(Arrays.asList(STATUE)), STATUE, MILITARY, ECONOMY, MILITARY));
        this.allWonders.add(new Wonder("Abu Simbel", ALLIED_CULTURES, ANCIENT_WORLD, new ArrayList<>(Arrays.asList(PALACE)), PALACE, MILITARY, RESEARCH, RESEARCH));
        this.allWonders.add(new Wonder("Tomb of Mausolus", CAPITAL_CITY, ANCIENT_WORLD, new ArrayList<>(Arrays.asList(TEMPLE)), TEMPLE, RESEARCH, ECONOMY, ECONOMY));
        this.allWonders.add(new Wonder("Lighthouse of Alexandria", CAPITAL_CITY, ANCIENT_WORLD, new ArrayList<>(Arrays.asList(NAVAL, TEMPLE)), NAVAL, ECONOMY, ECONOMY, ECONOMY));
        this.allWonders.add(new Wonder("Colossus of Rhodes", CAPITAL_CITY, ANCIENT_WORLD, new ArrayList<>(Arrays.asList(NAVAL, STATUE)), NAVAL, RESEARCH, NONE, RESEARCH));
        this.allWonders.add(new Wonder("Hagia Sophia", CAPITAL_CITY, GREAT_EMPIRES, new ArrayList<>(Arrays.asList(TEMPLE)), UNSYNERGIZED, RESEARCH, ECONOMY, NONE));
        this.allWonders.add(new Wonder("Colosseum", CAPITAL_CITY, GREAT_EMPIRES, new ArrayList<>(Arrays.asList(ARENA, FORTRESS)), STATUE, MILITARY, ECONOMY, MILITARY));
        this.allWonders.add(new Wonder("Palace of Aachen", CAPITAL_CITY, GREAT_EMPIRES, new ArrayList<>(Arrays.asList(FORTRESS, PALACE)), FORTRESS, MILITARY, ECONOMY, MILITARY));
        this.allWonders.add(new Wonder("Sherwood Forest", CAPITAL_CITY, GREAT_EMPIRES, new ArrayList<>(Arrays.asList(FORTRESS, NATURE)), FORTRESS, MILITARY, RESEARCH, MILITARY));
        this.allWonders.add(new Wonder("Terracotta Army", ALLIED_CULTURES, GREAT_EMPIRES, new ArrayList<>(Arrays.asList(FORTRESS, STATUE)), FORTRESS, MILITARY, ECONOMY, MILITARY));
        this.allWonders.add(new Wonder("Forbidden City", ALLIED_CULTURES, GREAT_EMPIRES, new ArrayList<>(Arrays.asList(PALACE, TEMPLE)), TEMPLE, ECONOMY, ECONOMY, ECONOMY));
        this.allWonders.add(new Wonder("Great Wall", ALLIED_CULTURES, GREAT_EMPIRES, new ArrayList<>(Arrays.asList(FORTRESS)), FORTRESS, MILITARY, RESEARCH, RESEARCH));
        this.allWonders.add(new Wonder("Sayil Palace", ALLIED_CULTURES, GREAT_EMPIRES, new ArrayList<>(Arrays.asList(FORTRESS, PALACE)), FORTRESS, MILITARY, ECONOMY, MILITARY));
        this.allWonders.add(new Wonder("Chichen Itza", ALLIED_CULTURES, GREAT_EMPIRES, new ArrayList<>(Arrays.asList(TEMPLE, ARENA)), ARENA, MILITARY, ECONOMY, MILITARY));
        this.allWonders.add(new Wonder("Tikal", ALLIED_CULTURES, GREAT_EMPIRES, new ArrayList<>(Arrays.asList(ARENA)), ARENA, ECONOMY, ECONOMY, ECONOMY));
        this.allWonders.add(new Wonder("Cité de Carcassonne", CAPITAL_CITY, STORIES_AND_MYTHS, new ArrayList<>(Arrays.asList(FORTRESS, PALACE)), UNSYNERGIZED, MILITARY, MILITARY, NONE));
        this.allWonders.add(new Wonder("Leaning Tower of Pisa", CAPITAL_CITY, STORIES_AND_MYTHS, new ArrayList<>(Arrays.asList(NATURE, TEMPLE)), NATURE, RESEARCH, RESEARCH, RESEARCH));
        this.allWonders.add(new Wonder("Alhambra", CAPITAL_CITY, STORIES_AND_MYTHS, new ArrayList<>(Arrays.asList(FORTRESS, NATURE)), UNSYNERGIZED, MILITARY, ECONOMY, NONE));
        this.allWonders.add(new Wonder("Yggdrasil", ALLIED_CULTURES, STORIES_AND_MYTHS, new ArrayList<>(Arrays.asList(NATURE, NATURE, STATUE, STATUE)), UNSYNERGIZED, ECONOMY, ECONOMY, NONE));
        this.allWondersByName = new HashMap<>();
        for(Wonder w : allWonders)
        {
            allWondersByName.put(w.getName(), w);
        }
    }

    public Wonder[] getWondersForLocation(WonderLocation wonderLocation){
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
        // Boosts the Hit Points of all of your Ranged Units
        this.allWondersByName.get("Sherwood Forest").setSelfBonusOne(NONE);

        // Boosts the Hit Points of all of your Ranged Units by 2.0% extra per every other active Fortress
        this.allWondersByName.get("Sherwood Forest").setSynergyBonus(NONE);

        // Boosts the Hit Points of all of your Bastion Units
        this.allWondersByName.get("Sayil Palace").setSelfBonusOne(NONE);

        // Boosts the Damage of all of your Bastion Units by 2.0% extra per every other active Fortress
        this.allWondersByName.get("Sayil Palace").setSynergyBonus(NONE);
    }
}
