package StringCoding;

import java.util.*;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            // Check s -> t mapping
            if (sToT.containsKey(sc)) {
                if (sToT.get(sc) != tc) return false;
            } else {
                sToT.put(sc, tc);
            }

            // Check t -> s mapping
            if (tToS.containsKey(tc)) {
                if (tToS.get(tc) != sc) return false;
            } else {
                tToS.put(tc, sc);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";

        String s2 = "foo";
        String t2 = "bar";

        System.out.println("Is 'egg' and 'add' isomorphic? " + isIsomorphic(s1, t1)); // true
        System.out.println("Is 'foo' and 'bar' isomorphic? " + isIsomorphic(s2, t2)); // false
    }
}
