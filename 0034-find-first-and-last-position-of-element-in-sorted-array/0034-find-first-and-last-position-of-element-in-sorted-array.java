class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] res={-1,-1};
        res[0]=findbound(nums,target,true);
        res[1]=findbound(nums,target,false);
        return res;
    }
    private int findbound(int nums[],int target,boolean istrue){
        int low=0;int high=nums.length-1;int bound=-1;
        while(low<=high){
           int mid=low+(high-low)/2;
            if(nums[mid]==target){
                bound=mid;
                if(istrue){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }}
                else if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        
        return bound;
    }
}