import java.util.*;

public class Solution {
    public int solve(int A, int B, int C, int D) {
        if( A == C && B == D){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solve(1, 2, 3, 4));
    }
}