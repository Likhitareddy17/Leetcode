class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
       
       int dup=0,missing=0;
       for(int num:nums){
        if(!set.add(num))
        dup=num;
       }
       for(int i=1;i<=nums.length;i++){
        if(!set.contains(i))
        missing=i;
       }
       return new int[]{dup,missing};
    }
}