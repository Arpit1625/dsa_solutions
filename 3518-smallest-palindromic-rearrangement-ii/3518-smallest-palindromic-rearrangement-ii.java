class Solution {
    static final int MAX = 5000;
    static final int LIM = 1000000;

    static int[] primes;
    static int[][] factExp;

    static {
        boolean[] comp = new boolean[MAX + 1];
        int cnt = 0;
        for (int i = 2; i <= MAX; i++) {
            if (!comp[i]) {
                cnt++;
                if ((long) i * i <= MAX) {
                    for (int j = i * i; j <= MAX; j += i) comp[j] = true;
                }
            }
        }
        primes = new int[cnt];
        int[] idx = new int[MAX + 1];
        int p = 0;
        for (int i = 2; i <= MAX; i++) {
            if (!comp[i]) {
                primes[p] = i;
                idx[i] = p++;
            }
        }
        factExp = new int[MAX + 1][cnt];
        for (int i = 1; i <= MAX; i++) {
            System.arraycopy(factExp[i - 1], 0, factExp[i], 0, cnt);
            int x = i;
            while (x > 1) {
                for (int j = 0; j < cnt && (long) primes[j] * primes[j] <= x; j++) {
                    while (x % primes[j] == 0) {
                        factExp[i][j]++;
                        x /= primes[j];
                    }
                }
                if (x > 1) {
                    factExp[i][idx[x]]++;
                    break;
                }
            }
        }
    }

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        int[] half = new int[26];
        char mid = 0;
        int len = 0;
        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            len += half[i];
            if ((freq[i] & 1) == 1) mid = (char) ('a' + i);
        }

        if (countWays(half, len) < k) return "";

        StringBuilder left = new StringBuilder();
        for (int pos = 0; pos < len; pos++) {
            for (int c = 0; c < 26; c++) {
                if (half[c] == 0) continue;
                half[c]--;
                int ways = countWays(half, len - pos - 1);
                if (ways >= k) {
                    left.append((char) ('a' + c));
                    break;
                } else {
                    k -= ways;
                    half[c]++;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);
        if (mid != 0) ans.append(mid);
        ans.append(new StringBuilder(left).reverse());
        return ans.toString();
    }

    private int countWays(int[] half, int total) {
        int m = primes.length;
        int[] exp = new int[m];
        System.arraycopy(factExp[total], 0, exp, 0, m);
        for (int v : half) {
            if (v > 0) {
                int[] e = factExp[v];
                for (int i = 0; i < m; i++) exp[i] -= e[i];
            }
        }
        long res = 1;
        for (int i = 0; i < m; i++) {
            if (exp[i] == 0) continue;
            res = mulPowCap(res, primes[i], exp[i], LIM);
            if (res >= LIM) return LIM;
        }
        return (int) res;
    }

    private long mulPowCap(long res, int base, int exp, int cap) {
        long b = base;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res *= b;
                if (res >= cap) return cap;
            }
            exp >>= 1;
            if (exp > 0) {
                b *= b;
                if (b >= cap) b = cap;
            }
        }
        return res;
    }
}