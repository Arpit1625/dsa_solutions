import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int arr [] = {21473,14891, 26474, 2116};
        ArrayList <Integer> li = new ArrayList<>();
        li = StockSpanProblem.calculateSpan(arr);
        System.out.println();
        for(int i =0; i< li.size(); i++){
            System.out.print(li.get(i) + " ");
        }
    }
    static ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList <Integer> li = new ArrayList<>();
        Stack <Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!st.empty() && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                li.add(i+1);
            }
            if(!st.empty()){
                li.add(i, i-st.peek());
            }
            st.push(i);
        }
        return li;
    }
}
