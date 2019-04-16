package rocks.zipcode.io.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        StringBuilder sb = new StringBuilder();
        for(Character c : chars){
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if(!isVowel(string.charAt(i))){
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        StringBuilder sb = new StringBuilder();
        char[] chArr = charactersToRemove.toCharArray();
        char[] strCharr = string.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : chArr){
            list.add(c);
        }
        for(char c : strCharr){
            if(!list.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static Boolean isVowel(Character character) {
        if ((character == 'A' || character == 'a') ||
                (character == 'E' || character == 'e') ||
                (character == 'I' || character == 'i') ||
                (character == 'O' || character == 'o') ||
                (character == 'U' || character == 'u')) {
            return true;
        }
        return false;
    }
}
