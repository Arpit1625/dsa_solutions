public class Nth {
    public static int countWays(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int prev1 = 2;
        int prev2 = 1;
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String[] args) {
        System.out.println(countWays(1));
        System.out.println(countWays(2));
        System.out.println(countWays(4));
        System.out.println(countWays(10));
    }
}
