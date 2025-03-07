import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestPrimeinRange {
    public static void main(String[] args) {
        int left = 10;
        int right = 19;
        int arr[] = closestPrimes(left , right);
        for(int nums : arr){
            System.out.print(nums + " ");
        }
    }
    public static int[] closestPrimes(int left, int right) {
        List<Integer> primes = sieve(right);
        List<Integer> filteredPrimes = new ArrayList<>();
        for (int p : primes) {
            if (p >= left && p <= right) {
                filteredPrimes.add(p);
            }
        }
        if (filteredPrimes.size() < 2) {
            return new int[]{-1, -1};
        }
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[]{-1, -1};
        for (int i = 0; i < filteredPrimes.size() - 1; i++) {
            int currentDiff = filteredPrimes.get(i + 1) - filteredPrimes.get(i);
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                result[0] = filteredPrimes.get(i);
                result[1] = filteredPrimes.get(i + 1);
            }
        }
        return result;
    }
    static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
