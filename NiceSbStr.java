import java.util.HashSet;
import java.util.Set;

public class NiceSbStr {
    public static void main(String[] args) {
        String d = "YazaAay";
        System.out.println(longestNiceSubstring(d));
    }
    static String longestNiceSubstring(String s) {
        int n = s.length();
        for (int l = n; l >= 1; l--) {
            for (int i = 0; i <= n - l; i++) {
                int start = i;
                int end = i + l;
                if (isNice(s, start, end)) {
                    return s.substring(start, end);
                }
            }
        }
        return "";
    }

    static boolean isNice(String s, int start, int end) {
        Set<Character> chars = new HashSet<>();
        for (int i = start; i < end; i++) {
            chars.add(s.charAt(i));
        }
        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                if (!chars.contains(Character.toUpperCase(c))) {
                    return false;
                }
            } else {
                if (!chars.contains(Character.toLowerCase(c))) {
                    return false;
                }
            }
        }
        return true;
    }
}
