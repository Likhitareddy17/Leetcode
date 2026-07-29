import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int halfLen = n / 2;

        // 1. Extract the left half
        char[] leftArray = s.substring(0, halfLen).toCharArray();

        // 2. Sort the left half to make it lexicographically smallest
        Arrays.sort(leftArray);
        String left = new String(leftArray);

        // 3. Extract middle character (if length is odd)
        String middle = (n % 2 == 1) ? String.valueOf(s.charAt(halfLen)) : "";

        // 4. Create right half by reversing the sorted left half
        String right = new StringBuilder(left).reverse().toString();

        // 5. Assemble and return
        return left + middle + right;
    }
}