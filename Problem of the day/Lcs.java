public class Lcs {
    public static void main(String atrgs[]){
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        System.out.print(lcs(s1 , s2));
    }
    static int lcs(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int[][] arr = new int[l1 + 1][l2 + 1];
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                }
                else {
                    arr[i][j] = Math.max(arr[i - 1][j],arr[i][j - 1]);
                }
            }
        }
        return arr[l1][l2];
    }
}
