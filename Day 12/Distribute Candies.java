public class Solution {
    public int candy(int[] A) {
        int n = A.length;
        int[] candies = new int[n];
        
        // Initialize all candies as 1
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }
        
        // Traverse from left to right
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        
        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > A[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
        }
        
        // Calculate total candies
        int totalCandies = 0;
        for (int i = 0; i < n; i++) {
            totalCandies += candies[i];
        }
        
        return totalCandies;
    }
}