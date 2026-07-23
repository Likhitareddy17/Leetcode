class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;int xor;
        int k=(int)(Math.log(n)/Math.log(2));
        if(n==1){
            xor=1;
        }
        else if(n==2){
            xor=2;
        }
        else if(n==3){
            xor=4;
        }
        else{
            xor=(int)Math.pow(2,k+1);
        }
        return xor;
    }
}