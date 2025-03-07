import java.util.Stack;
public class StackMid {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        for(int i = 1; i <= 5; i++){
            st.push(i);
        }
        midDel(st);
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
    static Stack<Integer> midDel(Stack <Integer> st){
        if(st.isEmpty()){
            return st;
        }
        int mid = st.size()/2 + 1;
        delMid(st , mid);
        return st;
    }
    static void  delMid(Stack <Integer> st , int mid){
        if(mid == 1){
            st.pop();
            return;
        }
        int val = st.peek();
        st.pop();
        delMid(st, mid-1);
        st.push(val);
        return;
    } 
}
