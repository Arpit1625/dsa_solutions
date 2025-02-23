import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {41 ,88 ,58 ,69 ,93 ,42 ,44 ,25 ,12,47,41,88,58,69,93,42,44,25,12,47};
        ArrayList <Integer> li = new ArrayList<>();
        li = NextGreaterElement.nextLargerElement(arr);
        for(int i =0; i< li.size(); i++){
            System.out.print(li.get(i) + " ");
        }
    }
    static ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList <Integer> li = new ArrayList<>();
        for(int i =0; i < arr.length; i++){
            li.add(-1);
        }
        Stack <Integer> st = new Stack<>();
        for(int i= arr.length-1; i >= 0;  i-- ){
            while(!st.empty() && arr[i] >=st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                li.set(i, st.peek());
            }
            st.push(arr[i]);
        }
        return li;
    }
}
