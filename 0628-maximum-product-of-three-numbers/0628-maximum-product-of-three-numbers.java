class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;int prod=1;
        Arrays.sort(nums);
            prod=Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]); 
       return prod;
        
    }
}