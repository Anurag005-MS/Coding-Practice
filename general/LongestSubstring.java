package wayfair;
import java.util.*;

public class LongestSubstring {
        public static int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int left = 0, maxLength = 0;

            for (int right = 0; right < s.length(); right++) {
                char currentChar = s.charAt(right);

                // If character already in set, shrink window from left
                while (set.contains(currentChar)) {
                    set.remove(s.charAt(left));
                    left++;
                }

                // Add new character to set
                set.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }

        public static void main(String[] args) {
            String input = "abcabcbb";
            int result = lengthOfLongestSubstring(input);
            System.out.println("Length of longest substring without repeating characters: " + result);
        }
    }


