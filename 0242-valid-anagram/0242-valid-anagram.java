class Solution {
    public boolean isAnagram(String s, String t) {
     int   s1=s.length();
      int  s2=t.length();
        if(s1!=s2)
        return false;
        int [] freq=new int[26];
        for(int i=0;i<s1;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
    for(int count:freq){
        if(count!=0)
        return false;
    }
    return true;
    }
}