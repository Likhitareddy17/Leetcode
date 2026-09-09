class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == 0) {
                // Shift elements to the right to make room, letting the end fall off
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                // If there's space for the second zero within the array bounds
                if (i + 1 < n) {
                    arr[i + 1] = 0;
                }
                // Skip past both zeros
                i += 2;
            } else {
                i += 1;
            }
        }
    }
}
        
    
