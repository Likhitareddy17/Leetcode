import java.util.Arrays;

public class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // last[j] stores the largest index in word1 where word1[index] == word2[j]
        // when matching word2 from right-to-left exact match.
        int[] last = new int[m];
        Arrays.fill(last, -1);

        int i = n - 1;
        int j = m - 1;
        while (i >= 0 && j >= 0) {
            if (word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j--;
            }
            i--;
        }

        int[] ans = new int[m];
        boolean canSkip = true; // We are allowed 1 mismatch
        j = 0; // Pointer for word2

        // Greedily iterate left-to-right through word1
        for (i = 0; i < n; i++) {
            if (j == m) {
                break;
            }

            // Option 1: Exact match - always greedily accept!
            if (word1.charAt(i) == word2.charAt(j)) {
                ans[j] = i;
                j++;
            } 
            // Option 2: Mismatch - accept ONLY if we haven't used our mismatch 
            // AND the remaining suffix of word2 can still be matched in word1.
            else if (canSkip && (j == m - 1 || i < last[j + 1])) {
                canSkip = false;
                ans[j] = i;
                j++;
            }
        }

        // Return ans if we matched all of word2, otherwise empty array
        return j == m ? ans : new int[0];
    }
}