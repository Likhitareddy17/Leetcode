class Solution {
    public int candy(int[] ratings) {
       int n=ratings.length;
       int candies[]=new int[n];
       for(int i=0;i<n;i++)
       {
        candies[i]=1;
       } 
       for(int j=1;j<n;j++){
        if(ratings[j]>ratings[j-1]){
            candies[j]=candies[j-1]+1;
        }}
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=candies[i];
        }
        return sum;
       }
}