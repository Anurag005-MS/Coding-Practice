package ArrayCoding;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of nums1 and nums2
        int i = m - 1; // pointer for nums1
        int j = n - 1; // pointer for nums2
        int k = m + n - 1; // pointer for merged array in nums1

        // Merge nums2 into nums1 starting from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    // Sample usage
    public static void main(String[] args) {
        MergeSortedArray merger = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        merger.merge(nums1, m, nums2, n);

        System.out.println("Merged Array: ");
        for (int num : nums1) {

            System.out.print(num + " ");
        }
    }
}

