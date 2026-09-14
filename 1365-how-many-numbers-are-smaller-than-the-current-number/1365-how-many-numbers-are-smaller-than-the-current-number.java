class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int n=nums.length;
      int arr[]=new int[n];
      int left=0;
      while(left<n){
        int right=0;
        int count=0;
        while(right<n){
            if(right!=left && nums[left]>nums[right]){
                count++;
            }
            right++;
        }
        arr[left]=count;
        left++;
      }  
      return arr;
    }
}