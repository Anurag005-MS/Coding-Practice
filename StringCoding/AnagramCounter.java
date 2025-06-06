package StringCoding;


import java.util.*;

public class AnagramCounter {

    // Helper to sort the characters of a word
    private static String sortWord(String word) {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static List<Integer> countAnagrams(String[] words, String[] queries) {
        Map<String, Integer> anagramMap = new HashMap<>();

        // Step 1: Preprocess the words
        for (String word : words) {
            String sorted = sortWord(word);
            anagramMap.put(sorted, anagramMap.getOrDefault(sorted, 0) + 1);
        }

        // Step 2: Check for each query
        List<Integer> result = new ArrayList<>();
        for (String query : queries) {
            String sortedQuery = sortWord(query);
            result.add(anagramMap.getOrDefault(sortedQuery, 0));
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "google", "gooegl"};
        String[] queries = {"listen", "google", "abc"};

        List<Integer> results = countAnagrams(words, queries);
        System.out.println(results); // Output: [3, 2, 0]
    }
}
