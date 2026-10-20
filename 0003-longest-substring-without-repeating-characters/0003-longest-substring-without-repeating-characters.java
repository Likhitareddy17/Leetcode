class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,maxlen=0;
        int n=s.length();
        for(int r=0;r<n;r++){
            char curr=s.charAt(r);
            if(map.containsKey(curr) && map.get(curr)>=l){
                l=map.get(curr)+1;
            }
            map.put(curr,r);
            
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}