class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
       Arrays.sort(nums);
       int max=nums[n-1]-1;
       int second_max=nums[n-2]-1;
       return max*second_max;
    }
}