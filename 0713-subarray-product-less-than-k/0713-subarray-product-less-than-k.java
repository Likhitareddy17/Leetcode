class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
     if(k<=1){
        return 0;
     }
     int c=0;int left=0;int p=1;
     for(int right=0;right<nums.length;right++){
            p*=nums[right];
            while(p>=k){
                p/=nums[left];
                left++;
            }
            c+=right-left+1;
        }
     
     return c;   
    }
}