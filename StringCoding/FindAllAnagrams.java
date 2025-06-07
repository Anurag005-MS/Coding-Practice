package StringCoding;
import java.util.*;

public class FindAllAnagrams {




        public static List<Integer> findAnagrams(String s, String p) {
            List<Integer> result = new ArrayList<>();

            if (s.length() < p.length()) return result;

            // Frequency map for string p
            Map<Character, Integer> pMap = new HashMap<>();
            for (char ch : p.toCharArray()) {
                pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
            }

            // Window size = length of p
            int windowSize = p.length();
            Map<Character, Integer> windowMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                // Add current char to window
                char ch = s.charAt(i);
                windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

                // Remove the leftmost char once window exceeds size
                if (i >= windowSize) {
                    char toRemove = s.charAt(i - windowSize);
                    if (windowMap.get(toRemove) == 1) {
                        windowMap.remove(toRemove);
                    } else {
                        windowMap.put(toRemove, windowMap.get(toRemove) - 1);
                    }
                }

                // Compare window and p maps
                if (windowMap.equals(pMap)) {
                    result.add(i - windowSize + 1);
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String s = "cbaebabacd";
            String p = "abc";

            List<Integer> indices = findAnagrams(s, p);
            System.out.println("Start indices of anagrams: " + indices);
        }
    }


