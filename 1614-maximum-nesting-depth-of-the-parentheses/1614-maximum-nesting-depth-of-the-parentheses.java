class Solution {
    public int maxDepth(String s) {
        int ans = 0;
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