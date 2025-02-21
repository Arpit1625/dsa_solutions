// import java.util.HashMap;
import java.util.Stack;
public class Parenthesis {
    public static void main(String[] args) {
        String str = "([{]})";
        System.out.println(Parenthesis.parenthesisChecker(str));
    }
    static boolean parenthesisChecker(String  str){
        // HashMap <Character , Integer> hm = new HashMap<>(); fails for "([{]})"
        // for(int i =0; i < str.length(); i++){
        //     if(str.charAt(i) == '[' || str.charAt(i) == ']' || str.charAt(i) == '{' || str.charAt(i) == '}' || str.charAt(i) == '(' || str.charAt(i) == ')'){
        //         hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0)+1);
        //     }
        // }
        // System.out.println(hm.get(']'));
        // System.out.println(hm.get('['));
        // System.out.println(hm.get('}'));
        // System.out.println(hm.get('{'));
        // System.out.println(hm.get('('));
        // System.out.println(hm.get(')'));
        // if(hm.get(']') == hm.get('[') && hm.get('}') == hm.get('{') && hm.get('(') == hm.get(')')){
        //     return true;
        // }
        Stack <Character> st = new Stack<>();
        for(int i=0 ; i < str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                st.push(str.charAt(i));
            }
            else{
                if(st.empty()){
                    return false;
                }
                if(str.charAt(i) == ')' && st.peek() == '(' || str.charAt(i) == '}' && st.peek() == '{' || str.charAt(i) == ']' && st.peek() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.empty()){
            return true;
        }
        return false;
    }
}
