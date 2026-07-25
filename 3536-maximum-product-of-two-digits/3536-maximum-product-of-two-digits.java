class Solution {
    public int maxProduct(int n) {
        int fm=-1,sm=-1;int digit;
        int prod=1;
        while(n!=0){
            digit=n%10;
            if(digit>fm){
                sm=fm;
                fm=digit;
            }
           else if(digit>sm){
                sm=digit;
            }
            
            n/=10;
        }
        prod=fm*sm;
        return prod;
    }
}