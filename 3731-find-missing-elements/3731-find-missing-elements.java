class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       int minvalue=Integer.MAX_VALUE;
       int maxvalue=Integer.MIN_VALUE;
       for(int num:nums){
        set.add(num);
       if(minvalue>num) minvalue=num;
       if(maxvalue<num) maxvalue=num;
       }
       List<Integer> missing=new ArrayList<>();
        for(int i=minvalue;i<maxvalue;i++){
            if(!set.contains(i)){
                missing.add(i);
            }
        }
       return missing;
    }
}