import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MaxOfMin {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 50, 10, 70, 30};
        ArrayList <Integer> li = new ArrayList<>();
        li = maxOfMins(arr);
        for(int i=0 ; i< li.size(); i++){
            System.out.print(li.get(i) + " ");
        }
    }
    static ArrayList<Integer> maxOfMins(int[] arr){
        // ArrayList <Integer> li = new ArrayList<>();
        // for(int i = 0; i < arr.length ; i++){
        //     li.add(0);
        // }
        // for(int i =1; i <= arr.length ; i++){
        //     int max = Integer.MIN_VALUE;
        //     for(int j=0; j<= arr.length-i ; j++){
        //         int min = arr[j];
        //         for (int k = 1; k < i; k++) {
        //             if (arr[j + k] < min){
        //                 min= arr[j + k];
        //             }
        //         }
        //         if(max<min){
        //             max = min;
        //         }
        //     }
        //     li.set(i - 1, max);
        // }
        // return li;
        int[] arrL = new int[arr.length];
        int[] arrR = new int[arr.length];
        int[] res = new int[arr.length];
        
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                arrL[i] = -1;
            } else {
                arrL[i] = st.peek();
            }
            st.push(i);
        }
        
        st.clear();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                arrR[i] = arr.length;
            } else {
                arrR[i] = st.peek();
            }
            st.push(i);
        }
        
        Arrays.fill(res, Integer.MIN_VALUE);
        
        for (int i = 0; i < arr.length; i++) {
            int len = arrR[i] - arrL[i] - 1;
            res[len - 1] = Math.max(res[len - 1], arr[i]);
        }
        
        for (int i = arr.length - 2; i >= 0; i--) {
            res[i] = Math.max(res[i], res[i + 1]);
        }
        
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            li.add(res[i]);
        }
        
        return li;
    }
}
