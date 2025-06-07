package StringCoding;
import java.util.*;

public class GroupANagrams {

        public static List<List<String>> groupAnagrams(String[] strs) {
            // HashMap to store sorted string as key and list of anagrams as value
            Map<String, List<String>> map = new HashMap<>();

            for (String word : strs) {
                // Convert word to char array, sort it, then convert back to string
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);

                // Group anagrams using the sorted string
                map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
            }

            // Return all grouped anagrams
            return new ArrayList<>(map.values());
        }

        // Main method with sample input/output
        public static void main(String[] args) {
            String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

            List<List<String>> result = groupAnagrams(input);

            System.out.println("Grouped Anagrams:");
            for (List<String> group : result) {
                System.out.println(group);
            }
        }
    }

