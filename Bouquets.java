public class Bouquets {
    public static void main(String[] args) {
        int arr[] = {1,10,3,10,2};
            int m =3;
            int k =1;
            System.out.println(minDays(arr, m, k));
        }
    static int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) {
            return -1;
        }
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            minDay = Math.min(minDay, day);
            maxDay = Math.max(maxDay, day);
        }
        int left = minDay;
        int right = maxDay;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    static boolean canMakeBouquets(int[] bloomDay, int m, int k, int days) {
        int bouquets = 0;
        int adjacentFlowers = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                adjacentFlowers++;
                if (adjacentFlowers == k) {
                    bouquets++;
                    adjacentFlowers = 0;
                }
            } else {
                adjacentFlowers = 0;
            }
        }
        return bouquets >= m;
    }
}
