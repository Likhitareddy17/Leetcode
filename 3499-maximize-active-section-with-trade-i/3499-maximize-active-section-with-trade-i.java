class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
   
        int n = s.length();
        List<Integer> arr = new ArrayList<>();
        
        // Step 1: Compress s into signed lengths (+ for '1's, - for '0's)
        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            int len = j - i;
            arr.add(s.charAt(i) == '1' ? len : -len);
            i = j;
        }

        // Step 2: Sum up all positive numbers (original '1's)
        int totalPositives = 0;
        for (int val : arr) {
            if (val > 0) {
                totalPositives += val;
            }
        }

        // Step 3: Find max sum obtained by flipping one middle positive value to negative
        // Flipping +len between -A and -B creates a merged block of: | -A | + len + | -B |
        int maxActive = totalPositives;
        
        for (int k = 1; k < arr.size() - 1; k++) {
            if (arr.get(k) > 0) { // Found a positive surrounded by values
                int leftZeroes = Math.abs(arr.get(k - 1));
                int rightZeroes = Math.abs(arr.get(k + 1));
                int flippedVal = arr.get(k); // loss of this positive block initially
                
                // New ones gained = leftZeroes + flippedVal + rightZeroes
                // Remaining ones = totalPositives - flippedVal
                int currentTotal = (leftZeroes + flippedVal + rightZeroes) + (totalPositives - flippedVal);
                
                maxActive = Math.max(maxActive, currentTotal);
            }
        }

        return maxActive;
    }
}



    