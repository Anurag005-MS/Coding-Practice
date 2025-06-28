package ArrayCoding;
import java.util.*;

public class TopKFrequentElements {

        public List<Integer> topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int num : nums) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> countMap.get(a) - countMap.get(b));
            for (int num : countMap.keySet()) {
                heap.add(num);
                if (heap.size() > k) heap.poll();
            }
            List<Integer> result = new ArrayList<>(heap);
            Collections.reverse(result);
            return result;
        }
        public static void main(String[] args) {
            TopKFrequentElements sol = new TopKFrequentElements();
            int[] nums = {5,5,5,1,1,1,1,4,4,4,4,3,3};
            System.out.println("Output: " + sol.topKFrequent(nums, 2));
        }
    }


