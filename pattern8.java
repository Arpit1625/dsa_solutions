public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n; i>0; i--){
            for(int k =i; k<n ; k++){
                System.out.print(" ");
            }
            for(int j=0; j< (2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
