public class TwoEqual {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
        System.out.println(areAlmostEqual("attack", "defend"));
    }
    static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        int firstMismatch = -1, secondMismatch = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (firstMismatch == -1) {
                    firstMismatch = i;
                } else if (secondMismatch == -1) {
                    secondMismatch = i; 
                } else {
                    return false;
                }
            }
        }
        if (secondMismatch != -1 && s1.charAt(firstMismatch) == s2.charAt(secondMismatch) && s1.charAt(secondMismatch) == s2.charAt(firstMismatch)) {
            return true;
        }
        return false;
    }
}
