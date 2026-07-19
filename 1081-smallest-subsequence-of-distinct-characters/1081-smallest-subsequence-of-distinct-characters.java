
class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        
        // Find the last index where each character appears
        int[] lastIndex = new int[26];
        for (int i = 0; i < n; i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        char[] stack = new char[26]; 
        int top = -1;
        boolean[] seen = new boolean[26];
        
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            int currIdx = curr - 'a';
            if (seen[currIdx]) {
                continue;
            }
            
            // Maintain the monotonic property using our array stack pointer
            while (top >= 0 && stack[top] > curr && lastIndex[stack[top] - 'a'] > i) {
                seen[stack[top] - 'a'] = false; 
                top--; 
            }
            
            top++;
            stack[top] = curr;
            seen[currIdx] = true;
        }
        return new String(stack, 0, top + 1);
    }
}