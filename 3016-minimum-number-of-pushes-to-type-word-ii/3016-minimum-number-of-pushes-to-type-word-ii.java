class Solution {
    public int minimumPushes(String word) {
        int [] freq=new int[26];
        for(char c:word.toCharArray()){
            freq[c-'a']++;
        }
        Arrays.sort(freq);
         int distinctchar=0;
            int maxcount=0;
        for(int i=25;i>=0;i--){
            if(freq[i]==0) break;
           int multiplier=(distinctchar/8)+1;
           maxcount+=freq[i]*multiplier;
           distinctchar++;
        }
        return maxcount;
    }
}