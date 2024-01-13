public class Solution {
    public int numDistinct(String A, String B) {
        int m = A.length();
        int n = B.length();
        
        // Create a 2D array to store the count of solutions
        int[][] dp = new int[m + 1][n + 1];
        
        // Initialize the first column of dp, as an empty string will always have one subsequence in any string
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }
        
        // Fill dp[][] in bottom up manner
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If last characters don't match, then value is same as the value without last character in A.
                if (A.charAt(i - 1) != B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // If last characters match, then we have two options:
                    // 1. We consider last character of A (value without last character in A)
                    // 2. We don't consider last character of A (value without last characters in A and B)
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }
        
        return dp[m][n];
    }
}