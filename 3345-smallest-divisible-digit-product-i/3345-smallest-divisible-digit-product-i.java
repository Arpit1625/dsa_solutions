class Solution {
    public int smallestNumber(int n, int t) {
        for (int num = n; ; num++) {
            if (isDivisibleByT(num, t)) {
                return num;
            }
        }
    }
    private boolean isDivisibleByT(int num, int t) {
        if (t == 0) return false;
        if (num == 0) return t == 0;
        int product = 1;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }
        return product % t == 0;
    }
}