package rocks.zipcode.io.collections;

import java.util.*;


/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    protected final Set<TypeOfSet> originalSet;

    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        List<TypeOfSet> list = new ArrayList<>(originalSet);
        long subsets = (long) Math.pow(2, list.size());
        Set<Set<TypeOfSet>> result = new HashSet<>();

        for (int i = 0; i < subsets; i++) {
            Set<TypeOfSet> set = new HashSet<>();
            for (int j = 0; j < list.size(); j++) {
                if ((i & (1 << j)) != 0) {
                    set.add(list.get(j));
                }
            result.add(set);
            }
        }
        return result;
    }

    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}
