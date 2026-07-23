class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;int xor=1;
        if(n<=2) return n;
        else{
            while(xor<=n){
                xor<<=1;
            }
        }
        return xor;
    }
}
// int n=nums.length;int xor;
        // int k=(int)(Math.log(n)/Math.log(2));
        // if(n<=2){
        //     xor=n;
        // }
        // else{
        //     xor=(int)Math.pow(2,k+1);
        // }
        // return xor;