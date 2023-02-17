package nl.joerivandervelde.rocsyncalc.synergy;

import nl.joerivandervelde.rocsyncalc.wonder.Wonder;

import java.util.ArrayList;
import java.util.List;

public class SubsetCombinations {

    /**
     * From: https://stackoverflow.com/questions/29910312/algorithm-to-get-all-the-combinations-of-size-n-from-an-array-java
     */
    public static List<Wonder[]> subset(int k, Wonder[] input)
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
    private static Wonder[] getSubset(Wonder[] input, int[] subset) {
        Wonder[] result = new Wonder[subset.length];
        for (int i = 0; i < subset.length; i++)
            result[i] = input[subset[i]];
        return result;
    }

}
