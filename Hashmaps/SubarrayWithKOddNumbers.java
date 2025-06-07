package Hashmaps;

import java.util.HashMap;

public class SubarrayWithKOddNumbers {
    public static int countSubarraysWithKOdds(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // base case: zero odd numbers

        int count = 0, oddCount = 0;

        for (int num : nums) {
            if (num % 2 != 0) oddCount++;

            // If there was a previous prefix with (oddCount - k), we found a valid subarray
            count += map.getOrDefault(oddCount - k, 0);

            // Store current prefix sum count
            map.put(oddCount, map.getOrDefault(oddCount, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println("Output: " + countSubarraysWithKOdds(nums, k)); // Output: 2
    }
}

