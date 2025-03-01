public class DecodeString {
    public static void main(String[] args) {
        String s = "3[b2[ca]]";
        System.out.println(decodeString(s));
    }
    static String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                ans.append(s.charAt(i));
            }
            else {
                StringBuilder temp = new StringBuilder();
                while (ans.length() > 0
                       && ans.charAt(ans.length() - 1)
                              != '[') {
                    temp.insert(
                        0, ans.charAt(ans.length() - 1));
                    ans.deleteCharAt(ans.length() - 1);
                }
                ans.deleteCharAt(ans.length() - 1);
                StringBuilder num = new StringBuilder();
                while (ans.length() > 0
                       && Character.isDigit(
                           ans.charAt(ans.length() - 1))) {
                    num.insert(
                        0, ans.charAt(ans.length() - 1));
                    ans.deleteCharAt(ans.length() - 1);
                }
                int p = Integer.parseInt(num.toString());
                for (int j = 0; j < p; j++) {
                    ans.append(temp.toString());
                }
            }
        }

        return ans.toString();
    }
}
