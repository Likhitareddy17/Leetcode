class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        
        // 1. Initialize to 1, since 1 is always a common divisor
        int gcd = 1; 
        
        int min = nums[0];
        int max = nums[nums.length - 1];
        
        // 2. Loop up to the 'min' value, using <= so we include it
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }
        
        return gcd;
    }
}