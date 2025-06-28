package HackerRank;

import java.util.*;

public class BirthdayChocolate {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int n = s.size();

        if (n < m) return 0;

        // Step 1: Compute the sum of the first window of size m
        int windowSum = 0;
        for (int i = 0; i < m; i++) {
            windowSum += s.get(i);
        }
        if (windowSum == d) count++;

        // Step 2: Slide the window
        for (int i = m; i < n; i++) {
            windowSum += s.get(i) - s.get(i - m);
            if (windowSum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(1, 2, 1, 3, 2);
        int d = 3;  // day
        int m = 2;  // month
        System.out.println("Ways to divide: " + birthday(s, d, m));  // Output: 2
    }
}
