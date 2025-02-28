class MaxPoint {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(arr, k));
    }
    static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        for (int point : cardPoints) {
            totalSum += point;
        }
        if (k == n) {
            return totalSum;
        }
        int windowSize = n - k;
        int windowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }
        int minWindowSum = windowSum;
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }
        return totalSum - minWindowSum;
    }
}
