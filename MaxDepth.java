public class MaxDepth {
    public static void main(String[] args) {
        String s = "()(())((()()))";
        System.out.println(MaxDepth.maxDepth(s));
    }
    static int maxDepth(String s){
        int ans = Integer.MIN_VALUE;
        int temp = 0;
        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i) == '('){
                temp ++;
            }
            if(s.charAt(i) == ')'){
                ans = Math.max(ans, temp);
                temp --;
            }
            else{
                continue;
            }
        }
        return ans;
    }
}
