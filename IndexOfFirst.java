public class IndexOfFirst {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }
    static int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if (n == 0) {
            return 0;
        }
        if (n > h) {
            return -1;
        }
        for (int i = 0; i <= h- n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == n) {
                return i;
            }
        }
        return -1; 
    }
}
