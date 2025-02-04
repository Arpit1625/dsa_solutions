public class RemoveParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        String b = "";
        int count = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(count > 0){
                    b = b +s.charAt(i);
                }
                count++;
            }
            if(s.charAt(i) == ')'){
                count --;
                if(count > 0){
                    b = b +s.charAt(i);
                }
            }
        }
        System.out.println(b);
    }
}
