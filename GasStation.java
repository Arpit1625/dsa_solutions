public class GasStation {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(arr, arr1));
    }
    static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int currentTank = 0;
        int start = 0;
        
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            currentTank += diff;
            
            if (currentTank < 0) {
                start = i + 1;
                currentTank = 0;
            }
        }
        
        return total >= 0 ? start : -1;
    }
}
