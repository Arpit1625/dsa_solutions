public class SubsetSum {
    public static void main(String[] args) {
        int ar[] = {3, 34, 4, 12, 5, 2};
        System.out.println(isSubsetSum(ar, 9));
    }
    static boolean bool = false;
    static Boolean isSubsetSum(int arr[], int sum) {
        bool = false;
        issubset(0, arr, sum);
        return bool;
    }
    
    static void issubset(int ind, int arr[], int sum ){
        if(sum == 0){
            bool = true;
            return;
        }
        if(bool){
            return;
        }
        if(ind == arr.length){
            return;
        }
        if (sum >= arr[ind]) {
            issubset(ind + 1, arr, sum - arr[ind]);
        }
        if (!bool) {
            issubset(ind + 1, arr, sum);
        }
    }
}
