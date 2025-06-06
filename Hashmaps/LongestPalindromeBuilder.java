package Hashmaps;

import java.util.HashMap;

public class LongestPalindromeBuilder {
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                length += freq;
            } else {
                length += freq - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length += 1;  // one odd char can go in the center
        }

        return length;
    }

    public static void main(String[] args) {
        String input1 = "abccccdd";
        System.out.println("Longest palindrome length: " + longestPalindrome(input1));  // Output: 7

        String input2 = "aA";
        System.out.println("Longest palindrome length: " + longestPalindrome(input2));  // Output: 1
    }
}

