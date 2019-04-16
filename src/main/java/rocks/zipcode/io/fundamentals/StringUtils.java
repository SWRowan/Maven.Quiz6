package rocks.zipcode.io.fundamentals;


import rocks.zipcode.io.arrays.ArrayUtils;
import rocks.zipcode.io.collections.PowerSet;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        Collection<String> stringList = new ArrayList<>();
        // get length of string
        int length = string.length();
        // get range of length
        Integer[] range = ArrayUtils.getRange(0, length);
        PowerSet<Integer> powerSet = new PowerSet(range);
        powerSet.permute().forEach(set -> stringList.add(upperCaseIndices(string, set.toArray(new Integer[0]))));

        return stringList;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = Arrays.asList(indices);

        for (int i = 0; i < string.length(); i++) {
            if (list.contains(i)) {
                sb.append(string.toUpperCase().charAt(i));
            } else if (!list.contains(i)) {
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        StringBuilder sb = new StringBuilder(stringToBeManipulated);
        sb.replace(index, index, valueToBeInserted);
        return sb.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder sb = new StringBuilder(stringToBeManipulated);
        sb.deleteCharAt(index);
        sb.replace(index, index, replacementValue.toString());
        return sb.toString();
    }
}