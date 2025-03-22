public class SticklerHouse2 {
    public static void main(String[] args) {
        System.out.println(maxStolenValue(new int[]{2, 3, 2})); 
        System.out.println(maxStolenValue(new int[]{1, 2, 3, 1})); 
        System.out.println(maxStolenValue(new int[]{2, 2, 3, 1, 2})); 
    }
    public static int maxStolenValue(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];
        if (n == 2) return Math.max(arr[0], arr[1]);
        int option1 = robLinear(arr, 0, n - 2); 
        int option2 = robLinear(arr, 1, n - 1); 
        return Math.max(option1, option2);
    }
    private static int robLinear(int[] arr, int start, int end) {
        int prev2 = 0;
        int prev1 = 0; 
        for (int i = start; i <= end; i++) {
            int curr = Math.max(prev1, arr[i] + prev2); 
            prev2 = prev1; 
            prev1 = curr;  
        }
        return prev1;
    }
}
