class Solution {
    public String removeOuterParentheses(String s) {
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
        return b;
    }
}