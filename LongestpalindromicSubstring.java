public class LongestpalindromicSubstring {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(LongestpalindromicSubstring.longestPalindrome(s));
    }
    static String longestPalindrome(String s){
        String ans ="";

        for(int i = 0; i<s.length() ; i++){
            int a = 1;
            int b = 1;
            while(i-a >= 0 && i+a < s.length()){
                if(s.charAt(i-a) == s.charAt(i+a)){
                    a++;
                    b = b+2;
                }
                else{
                    break;
                }
            }
            if(b > ans.length()){
                int ind = i - b / 2;
                ans = s.substring(ind ,ind + b);
            }
        }

        for(int i = 0; i < s.length() -1; i++){
            int a = 1;
            int b = 0;
            while(i-a+1 >= 0 && i+a < s.length()){
                if(s.charAt(i-a+1) == s.charAt(i +a)){
                    a++;
                    b = b+2;
                }
                else{
                    break;
                }
            }
            if(b > ans.length()){
                int ind = i - b/2 + 1;
                ans = s.substring(ind , ind+b);
            }
        }
        return ans;
    }
}
