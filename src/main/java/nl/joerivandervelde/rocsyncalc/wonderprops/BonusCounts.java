package nl.joerivandervelde.rocsyncalc.wonderprops;

import nl.joerivandervelde.rocsyncalc.Wonder;

import java.util.Arrays;

public class BonusCounts {
    public int economy;
    public int military;
    public int research;
    public Wonder[] forWonders;

    @Override
    public String toString() {
        return "BonusCounts{" +
                "economy=" + economy +
                ", military=" + military +
                ", research=" + research +
                ", forWonders=" + Arrays.toString(forWonders) +
                '}';
    }
}
