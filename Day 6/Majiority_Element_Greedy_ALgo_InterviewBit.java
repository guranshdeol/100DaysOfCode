public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        int majorityIndex = 0;
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[majorityIndex] == A[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                majorityIndex = i;
                count = 1;
            }
        }
        return A[majorityIndex];
    }
}