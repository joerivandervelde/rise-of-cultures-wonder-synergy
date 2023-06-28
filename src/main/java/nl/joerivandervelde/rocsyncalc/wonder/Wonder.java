package nl.joerivandervelde.rocsyncalc.wonder;

import nl.joerivandervelde.rocsyncalc.wonder.properties.Bonus;
import nl.joerivandervelde.rocsyncalc.wonder.properties.WonderAge;
import nl.joerivandervelde.rocsyncalc.wonder.properties.WonderLocation;
import nl.joerivandervelde.rocsyncalc.wonder.properties.WonderType;

import java.util.List;
import java.util.Set;

public class Wonder {

    private final String name;
    private final WonderLocation wonderLocation;
    private final WonderAge wonderAge;
    private final List<WonderType> wonderType;
    private final WonderType synergizedByType;
    private Bonus selfBonusOne;
    private Bonus selfBonusTwo;
    private Bonus synergyBonus;

    public Wonder(String name, WonderLocation wonderLocation, WonderAge wonderAge, List<WonderType> wonderType, WonderType synergizedByType, Bonus selfBonusOne, Bonus selfBonusTwo, Bonus synergyBonus) {
        this.name = name;
        this.wonderLocation = wonderLocation;
        this.wonderAge = wonderAge;
        this.wonderType = wonderType;
        this.synergizedByType = synergizedByType;
        this.selfBonusOne = selfBonusOne;
        this.selfBonusTwo = selfBonusTwo;
        this.synergyBonus = synergyBonus;
    }

    public String getName() {
        return name;
    }

    public WonderLocation getWonderLocation() {
        return wonderLocation;
    }

    public List<WonderType> getWonderType() {
        return wonderType;
    }

    public WonderType getSynergizedByType() {
        return synergizedByType;
    }

    public Bonus getSelfBonusOne() {
        return selfBonusOne;
    }

    public Bonus getSelfBonusTwo() {
        return selfBonusTwo;
    }

    public Bonus getSynergyBonus() {
        return synergyBonus;
    }

    public void setSelfBonusOne(Bonus selfBonusOne) {
        this.selfBonusOne = selfBonusOne;
    }

    public void setSynergyBonus(Bonus synergyBonus) {
        this.synergyBonus = synergyBonus;
    }

    @Override
    public String toString() {
        return name;
    }
}
