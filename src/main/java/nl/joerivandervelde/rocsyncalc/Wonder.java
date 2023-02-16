package nl.joerivandervelde.rocsyncalc;

import nl.joerivandervelde.rocsyncalc.wonderprops.Bonus;
import nl.joerivandervelde.rocsyncalc.wonderprops.WonderAge;
import nl.joerivandervelde.rocsyncalc.wonderprops.WonderLocation;
import nl.joerivandervelde.rocsyncalc.wonderprops.WonderType;

import java.util.Set;

public class Wonder {

    private String name;
    private WonderLocation wonderLocation;
    private WonderAge wonderAge;
    private Set<WonderType> wonderType;
    private WonderType boostedByType;
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

    public WonderAge getWonderAge() {
        return wonderAge;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setWonderLocation(WonderLocation wonderLocation) {
        this.wonderLocation = wonderLocation;
    }

    public void setWonderAge(WonderAge wonderAge) {
        this.wonderAge = wonderAge;
    }

    public void setWonderType(Set<WonderType> wonderType) {
        this.wonderType = wonderType;
    }

    public void setBoostedByType(WonderType boostedByType) {
        this.boostedByType = boostedByType;
    }

    public void setBonusOne(Bonus bonusOne) {
        this.bonusOne = bonusOne;
    }

    public void setBonusTwo(Bonus bonusTwo) {
        this.bonusTwo = bonusTwo;
    }

    public void setBoosted(Bonus boosted) {
        this.boosted = boosted;
    }

    @Override
    public String toString() {
        return name;
    }
}
