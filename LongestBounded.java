import java.util.ArrayList;
import java.util.TreeSet;

public class LongestBounded {
    public static void main(String[] args) {
        int arr[] = {43 ,20 ,56 ,56 ,27 ,25,17};
        int x = 4;
        ArrayList<Integer> li = new ArrayList<>();
        li = longestSubarray(arr, x);
        for(int i = 0 ; i< li.size(); i++){
            System.out.print(li.get(i) + " ");
        }
    }
    static  ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // int n = arr.length;  Time limit excceeded for this
        // int max = 0;
        // int start = 0;
        // for (int i = 0; i < n; i++) {
        //     int min = arr[i];
        //     int maxi = arr[i];
        //     for (int j = i; j < n; j++) {
        //         min = Math.min(min, arr[j]);
        //         maxi = Math.max(maxi, arr[j]);
        //         if (maxi - min > x) {
        //             break;
        //         }
        //         int currentLength = j - i + 1;
        //         if (currentLength > max) {
        //             max = currentLength;
        //             start = i;
        //         }
        //     }
        // }
        // ArrayList<Integer> li = new ArrayList<>();
        // for (int i = start; i < start + max; i++) {
        //     li.add(arr[i]);
        // }
        // return li;
        int n = arr.length;
        int max = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int maxi = arr[i];
            for (int j = i; j < n; j++) {
                min = Math.min(min, arr[j]);
                maxi = Math.max(maxi, arr[j]);
                if (maxi - min > x) {
                    break;
                }
                int currentLength = j - i + 1;
                if (currentLength > max || (currentLength == max && i < start)) {
                    max = currentLength;
                    start = i;
                }
            }
        }
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = start; i < start + max; i++) {
            li.add(arr[i]);
        }
        return li;
    }
}
