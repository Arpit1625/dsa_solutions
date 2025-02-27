import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Getmin {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> output = new ArrayList<>();
        s.push(2);
        s.push(3);
        output.add(s.peek());
        s.pop();
        output.add(s.getMin());
        s.push(1);
        output.add(s.getMin());
        System.out.println(output);
    }
}
    class Solution {
    public Solution() {}

    Stack <Integer> st = new Stack<>();
    Stack <Integer> st1 = new Stack<>();
    public void push(int x) {
        st.push(x);
        if (st1.isEmpty() || x <= st1.peek()) {
            st1.push(x);
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            if (st.peek().equals(st1.peek())) {
                st1.pop();
            }
            st.pop();
        }
    }

    public int peek() {
        if(st.isEmpty()){
            return -1;
        }
        return  st.peek();
    }

    public int getMin() {
        if (st1.isEmpty()){
            return -1;
        }
        return st1.peek();
    }
}
