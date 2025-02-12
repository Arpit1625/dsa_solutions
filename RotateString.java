public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String b = "abced";
        System.out.println(RotateString.rotateString(s, b));
    }
    static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        int a = s.length();
        StringBuilder ans = new StringBuilder(s);
        while(a>0){
            char b = ans.charAt(0);
            ans.deleteCharAt(0);
            ans.append(b);
            if(ans.toString().equals(goal)){
                return true;
            }
            a--;
        }
        return false;
    }
}
