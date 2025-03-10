public class EditDistance {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcfe";
        System.out.println(editDistance(s, t));
    }
    static int editDistance(String s1, String s2){
        int [][] op = new int[s1.length()+1][s2.length()+1];
        for(int i =1; i <= s1.length(); i++){
            op[i][0] = i;
        }
        for(int i =1; i <= s2.length(); i++){
            op[0][i] = i;
        }
        for(int i =1; i <= s1.length(); i++){
            for(int j = 1; j <= s2.length(); j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    op[i][j] = op[i-1][j-1];
                }
                else{
                    op[i][j] = Math.min(op[i-1][j-1], Math.min(op[i-1][j], op[i][j-1]))+1;
                }
            }
        }
        return op[s1.length()][s2.length()];
    }
}
