import java.util.Arrays;

public class KthMissing {
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
    static int findKthPositive(int[] arr, int k) {
        int low = 1;
        int high = arr[arr.length - 1] + k;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessOrEqual(arr, mid);
            int missing = mid - count;
            
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    } 
    private static int countLessOrEqual(int[] arr, int x) {
        int index = Arrays.binarySearch(arr, x);
        if (index < 0) {
            index = -index - 1;
        } else {
            index += 1;
        }
        return index;
    }
}
