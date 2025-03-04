import java.util.ArrayList;
import java.util.Collections;

public class IncreasingSubsequence {
    public static void main(String[] args) {
        int arr[] = {5, 8, 3, 7, 9, 1};
        System.out.println(lis(arr));
    }
    static int lis(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0;
        ArrayList<Integer> li = new ArrayList<>();
        for (int num : arr) {
            int idx = Collections.binarySearch(li, num);
            if (idx < 0){
                idx = -idx - 1;
            }
            if (idx < li.size()){
                li.set(idx, num);
            }
            else{
                li.add(num);
            }    
        }
        return li.size();
    }
}
