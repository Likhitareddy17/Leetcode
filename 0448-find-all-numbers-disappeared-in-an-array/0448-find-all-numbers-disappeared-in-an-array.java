class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!set.contains(i))
            l.add(i);
        }
        return l;
    }
}