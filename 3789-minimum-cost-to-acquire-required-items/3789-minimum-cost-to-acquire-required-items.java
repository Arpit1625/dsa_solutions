class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long usingSeparate = (long) cost1 * need1 + (long) cost2 * need2;
        long usingBoth = (long) costBoth * Math.max(need1, need2);
        int min = Math.min(need1, need2);
        long usingMin = (long) costBoth * min + (long) cost1 * (need1 - min) + (long) cost2 * (need2 - min);
        return Math.min(usingMin, Math.min(usingSeparate, usingBoth));
    }
}