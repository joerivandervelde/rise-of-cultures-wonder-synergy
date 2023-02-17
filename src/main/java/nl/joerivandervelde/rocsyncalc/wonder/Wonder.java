package nl.joerivandervelde.rocsyncalc.wonder;

import nl.joerivandervelde.rocsyncalc.wonder.properties.Bonus;
import nl.joerivandervelde.rocsyncalc.wonder.properties.WonderAge;
import nl.joerivandervelde.rocsyncalc.wonder.properties.WonderLocation;
import nl.joerivandervelde.rocsyncalc.wonder.properties.WonderType;

import java.util.Set;

public class Wonder {

    private final String name;
    private final WonderLocation wonderLocation;
    private final WonderAge wonderAge;
    private final Set<WonderType> wonderType;
    private final WonderType boostedByType;
    private Bonus bonusOne;
    private Bonus bonusTwo;
    private Bonus boosted;

    public Wonder(String name, WonderLocation wonderLocation, WonderAge wonderAge, Set<WonderType> wonderType, WonderType boostedByType, Bonus bonusOne, Bonus bonusTwo, Bonus boosted) {
        this.name = name;
        this.wonderLocation = wonderLocation;
        this.wonderAge = wonderAge;
        this.wonderType = wonderType;
        this.boostedByType = boostedByType;
        this.bonusOne = bonusOne;
        this.bonusTwo = bonusTwo;
        this.boosted = boosted;
    }

    public String getName() {
        return name;
    }

    public WonderLocation getWonderLocation() {
        return wonderLocation;
    }

    public Set<WonderType> getWonderType() {
        return wonderType;
    }

    public WonderType getBoostedByType() {
        return boostedByType;
    }

    public Bonus getBonusOne() {
        return bonusOne;
    }

    public Bonus getBonusTwo() {
        return bonusTwo;
    }

    public Bonus getBoosted() {
        return boosted;
    }

    public void setBonusOne(Bonus bonusOne) {
        this.bonusOne = bonusOne;
    }

    public void setBoosted(Bonus boosted) {
        this.boosted = boosted;
    }

    @Override
    public String toString() {
        return name;
    }
}
