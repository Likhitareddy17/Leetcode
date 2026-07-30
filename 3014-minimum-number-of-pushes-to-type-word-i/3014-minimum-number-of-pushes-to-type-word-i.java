class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int difference,push=0;
        if(n<=8) return n;
        if(n>8 && n<=16){
            difference=n-8;
            push=(difference*2)+8;
        }
        if(n>16 && n<=24){
            push=(n-8)*3;
        }
        if(n>24){
            push=48+(n-24)*4;
        }
        return push;
    }
}