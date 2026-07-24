class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        HashSet<Integer> paired_xor=new HashSet<>();
        HashSet <Integer> xor=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                paired_xor.add(nums[i]^nums[j]);
            }}
          
            for(int i:paired_xor){
                for(int num:nums){
                xor.add(i^num);
            }
        }
    return xor.size();
    }
}