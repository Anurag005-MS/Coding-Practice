package wayfair;
import java.util.*;

public class validAnagram {

    public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    char[] a = s.toCharArray();
    char[] b = t.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Are anagrams? " + isAnagram(s1, s2));
    }
}
