package Hashmaps;

import java.util.HashMap;

public class WordPatternChecker {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(w)) return false;
            } else {
                if (wordToChar.containsKey(w)) return false;
                charToWord.put(c, w);
                wordToChar.put(w, c);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
    }
}
