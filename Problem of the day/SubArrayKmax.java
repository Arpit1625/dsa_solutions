import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SubArrayKmax {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        ArrayList<Integer>li = new ArrayList<>();
        li = maxOfSubarrays(arr, k);
        for(int i = 0; i < li.size(); i++){
            System.out.print(li.get(i) + " ");
        }
    }
    static ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        ArrayList<Integer>li = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            } 
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            
            deque.offerLast(i);
            
            if (i >= k - 1) {
                li.add(arr[deque.peekFirst()]);
            }
        }
        return li;
    }
}
