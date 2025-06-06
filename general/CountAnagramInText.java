package general;

import java.util.*;

public class CountAnagramInText {

    public static int countAnagrams(String text, String word) {
        int wordLen = word.length();
        int textLen = text.length();

        if (textLen < wordLen) return 0;

        Map<Character, Integer> wordFreq = new HashMap<>();
        for (char c : word.toCharArray())
            wordFreq.put(c, wordFreq.getOrDefault(c, 0) + 1);

        Map<Character, Integer> windowFreq = new HashMap<>();
        int count = 0;

        for (int i = 0; i < textLen; i++) {
            // Add current character to the window
            char ch = text.charAt(i);
            windowFreq.put(ch, windowFreq.getOrDefault(ch, 0) + 1);

            // Remove character left of window
            if (i >= wordLen) {
                char leftChar = text.charAt(i - wordLen);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
                if (windowFreq.get(leftChar) == 0)
                    windowFreq.remove(leftChar);
            }

            // Compare maps
            if (i >= wordLen - 1 && windowFreq.equals(wordFreq)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "cbaebabacd";
        String word = "abc";
        int result = countAnagrams(text, word);
        System.out.println("Number of anagrams of \"" + word + "\" in \"" + text + "\": " + result);
    }
}

