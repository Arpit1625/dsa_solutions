import java.util.Stack;

public class PostFix {
        public static void main(String[] args) {
            String arr[] = {"100", "200", "+", "2", "/", "5", "*", "7", "+"};
            System.out.print(evaluate(arr));
        }
        public static int evaluate(String[] arr) {
        Stack <String> st = new Stack <>();
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("*") && !arr[i].equals("/") && !arr[i].equals("+") && !arr[i].equals("-")){
                st.push(arr[i]);
                System.out.println(st.peek());
            }
            if(arr[i].equals("*") || arr[i].equals("/") || arr[i].equals("+") || arr[i].equals("-")){
                if(st.size()>1){
                    int ans =  Integer.parseInt(st.peek());
                    st.pop();
                    int sec = Integer.parseInt(st.peek());
                    st.pop();
                    if(arr[i].equals("*")){
                        ans = ans * sec;
                        String a = Integer.toString(ans);
                        st.push(a);
                        System.out.println(st.peek());
                        continue;
                    }
                    if(arr[i].equals("/")){
                        ans = sec/ans;
                        String a = Integer.toString(ans);
                        st.push(a);
                        System.out.println(st.peek());
                        continue;
                    }
                    if(arr[i].equals("-")){
                        ans = sec -ans;
                        String a = Integer.toString(ans);
                        st.push(a);
                        System.out.println(st.peek());
                        continue;
                    }
                    if(arr[i].equals("+")){
                        ans = ans + sec;
                        String a = Integer.toString(ans);
                        st.push(a);
                        System.out.println(st.peek());
                        continue;
                    }
                }
                else{
                    continue;
                }
            }
        }
        if(!st.isEmpty()){
        int ans = Integer.parseInt(st.peek());
        return ans;
        }
        return 0;
        }
}
