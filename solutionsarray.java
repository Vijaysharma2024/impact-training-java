public class Solution {

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create an instance of Solution
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};  // nums1 with m valid elements
        int[] nums2 = {2, 5, 6};            // nums2 with n elements
        int m = 3;  // Number of valid elements in nums1
        int n = 3;  // Number of elements in nums2

        // Call the merge method
        solution.merge(nums1, m, nums2, n);

        // Print the merged nums1 array
        System.out.println("Merged nums1: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    // Merge method that merges nums1 and nums2 into nums1
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;  // Pointer for the last valid element in nums1
        int j = n - 1;  // Pointer for the last element in nums2
        int k = m + n - 1;  // Pointer for the last position in nums1

        // Merge nums1 and nums2 in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];  // Place nums1[i] in the current position of nums1
                i--;  // Move the pointer in nums1 to the left
            } else {
                nums1[k] = nums2[j];  // Place nums2[j] in the current position of nums1
                j--;  // Move the pointer in nums2 to the left
            }
            k--;  // Move the position in nums1 to the left
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
