public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
        int totalGas = 0;
        int currentGas = 0;
        int startStation = 0;
        
        for (int i = 0; i < A.size(); i++) {
            totalGas += A.get(i) - B.get(i);
            currentGas += A.get(i) - B.get(i);
            
            if (currentGas < 0) {
                startStation = i + 1;
                currentGas = 0;
            }
        }
        
        return (totalGas < 0) ? -1 : startStation;
    }
}