class Solution {
    public int[] shuffle(int[] nums, int n) {
      ArrayList<Integer> al=new ArrayList<>();
      int i=0,j=n;
      while(i<n&&j<2*n){
            al.add(nums[i]);
            i++;
            al.add(nums[j]);
            j++;
        }
        int arr[] = new int[2*n];
        for(int k=0;k<al.size();k++){
            arr[k]=al.get(k);
        }
        return arr;
    }
}