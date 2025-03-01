public class MinChairs {
    public static void main(String[] args) {
        String s = "ELELEEL";
        System.out.println(minimumChairs(s));
    }
    static int minimumChairs(String s) {
        int cnt = 0, left = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'E') {
                if (left > 0) {
                    --left;
                } else {
                    ++cnt;
                }
            } else {
                ++left;
            }
        }
        return cnt;
    }
}
