class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handles cases where k is larger than array length
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[(i + k) % n] = nums[i]; // Wraps index cleanly around 0..n-1
        }
        
        // Copy back to the original array since the method is void
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
} 