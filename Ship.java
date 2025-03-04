public class Ship {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr , 5));
    }
    static int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, days, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static boolean canShip(int[] weights, int days, int capacity) {
        int dayCount = 1;
        int currentLoad = 0;
        for (int i = 0; i < weights.length; i++) {
            if (currentLoad + weights[i] > capacity) {
                dayCount++;
                currentLoad = 0;
            }
            currentLoad += weights[i];
            if (dayCount > days) {
                return false;
            }
        }
        return true;
    }
}
