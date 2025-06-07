package general;
import java.util.*;
public class SubArraySum {

        public int subarraySum(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1); // sum 0 seen once
            int count = 0, sum = 0;
            for (int num : nums) {
                sum += num;
                count += map.getOrDefault(sum - k, 0);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return count;
        }
        public static void main(String[] args) {
            SubArraySum sol = new SubArraySum();
            int[] nums = {1, 1, 1};
            int k = 2;
            System.out.println("Input: [1,1,1], k=2");
            System.out.println("Output: " + sol.subarraySum(nums, k)); // 2
        }
    }


