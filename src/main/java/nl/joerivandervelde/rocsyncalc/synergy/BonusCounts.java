package nl.joerivandervelde.rocsyncalc.synergy;

import nl.joerivandervelde.rocsyncalc.wonder.Wonder;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BonusCounts {

    public int economy;
    public int military;
    public int research;
    public Wonder[] forWonders;

    @Override
    public String toString() {
        return "Economy " + economy + ", military " + military + ", research " + research + " for " + Stream.of(forWonders).map(String::valueOf).collect(Collectors.joining(", "))+ ".";
    }
}
