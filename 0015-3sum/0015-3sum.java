class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
           int  left=i+1,right=n-1;
            while(left<right){
                if(nums[left]+nums[right]== -nums[i]){
                    l.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;right--;
                
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if(nums[left]+nums[right]>-nums[i]){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return l;
    }
}