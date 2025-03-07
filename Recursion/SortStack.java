import java.util.Stack;

public class SortStack {
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        for(int i = 6 ; i >=0 ; i--){
            st.push(i);
        }
        sort(st);
        while(!st.isEmpty()){
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }
    static void sort(Stack<Integer> st){
        if(st.isEmpty() || st.size() == 1){
            return;
        }
        int temp = st.peek();
        st.pop();
        sort(st);
        insert(st , temp);
    }
    static void insert (Stack <Integer> st, int temp){
        if(st.isEmpty() || st.peek() <= temp){
            st.push(temp);
            return;
        }
        int val = st.peek();
        st.pop();
        insert(st, temp);
        st.push(val);
    }
}
