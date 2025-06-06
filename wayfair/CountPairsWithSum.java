package wayfair;
import java.util.*;

public class CountPairsWithSum {
    public static int countPairs(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1};
        int k = 4;
        int result = countPairs(nums, k);
        System.out.println("Number of pairs with sum " + k + ": " + result);
    }
}

