package ArrayCoding;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Map to store number -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                // Found the pair
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        // If no solution found (problem states always one solution)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

