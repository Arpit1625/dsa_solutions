import java.util.Scanner;
public class NumberUsingRecursion {
    static void printNumber(int N){
        if(N==0){
            return;
        }
        printNumber(N-1);
        System.out.print(N+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number untill you want to print");
        int N = sc.nextInt();
        printNumber(N);
        sc.close();
    }
}
