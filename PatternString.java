public class PatternString {
    public static void main(String[] args) {
        String S = "Arpit";
        for(int i=S.length(); i>0;i--){
            for(int j = 0; j<i ; j++){
                System.out.print(S.charAt(j));
            }
            System.out.println();
        }
    }
}
