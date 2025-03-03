import java.util.Arrays;

public class PowerOfHeroes {
    public static void main(String[] args) {
        int arr[] = {2,1,4};
        System.out.println(sumOfPower(arr));
    }
    static int sumOfPower(int[] arr) {
        final int mod = (int) 1e9 + 7;
        Arrays.sort(arr);
        long res = 0;
        long k = 0;
        for (int i = arr.length - 1; i >= 0; --i) {
            long x = arr[i];
            res = (res + (x * x % mod) * x) % mod;
            res = (res + x * k % mod) % mod;
            k = (k * 2 + x * x % mod) % mod;
        }
        return (int) res;
    }
}
