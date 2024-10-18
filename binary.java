public class binary {
    public static void main(String[] args) {
        int n = 125 ;
        System.out.println(convertBinary(n));
    }

    public static int convertBinary(int n){
        int maxOne = 0 ;
        int curOne = 0 ;
        while(n!=0){
            if (n%2 == 1) {
                curOne+=1;
            }
            else{
                if(curOne>maxOne) maxOne = curOne ;
                curOne = 0 ;
            }
            n= n/2 ;
        }
        if(curOne>maxOne) maxOne = curOne ;
        return maxOne;
    }
}
