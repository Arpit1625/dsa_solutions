import java.util.Stack;

public class LongestParenthesis {
    public static void main(String[] args) {
        String str = "(((()()))())";
        System.out.println(LongestParenthesis.maxLength(str));
    }
    static int maxLength(String s){
        int ans =  0;
        Stack <Integer> st = new Stack<>();
        for(int i= 0; i<s.length() ; i++){
            if(s.charAt(i) == ')'){
                int temp =0;
                while(!st.isEmpty() && st.peek() != -1){
                    temp += st.pop();
                }
                ans = Math.max(ans, temp);
                if(st.isEmpty()){
                    continue;
                }
                st.pop();
                st.push(temp+2);
            }
            else{
                st.push(-1);
            }
        }
        int temp = 0;
        while(!st.isEmpty()){
            if(st.peek() == -1){
                temp = 0;
                st.pop();
            }
            else{
                temp += st.pop();
            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}
