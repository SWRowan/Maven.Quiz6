package rocks.zipcode.io.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        return list.toArray(new Integer[0]);
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char[] unbox = new char[array.length];
        int count = 0;
        for(Character c : array){
            unbox[count++] = c;
        }
        return unbox;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        Character[] box = new Character[array.length];
        int count= 0;
        for(char c : array){
            box[count++] = c;
        }
        return box;
    }
}
