public class PalindromeSubstr{
    public static void main(String[] args) {
        String s ="abaab";
        System.out.println(countPS(s));
    }
    static int countPS(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            count += expand(s, i, i);
            count += expand(s, i, i + 1);
        }
        return count;
    }
    static int expand(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if (right - left + 1 >= 2) {
                count++;
            }
            left--;
            right++;
        }
        return count;
    }
}