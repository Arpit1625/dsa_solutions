class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));
        int m = queries.length;
        int[][] queryPairs = new int[m][2];
        for (int i = 0; i < m; i++) {
            queryPairs[i] = new int[]{queries[i], i};
        }
        Arrays.sort(queryPairs, (a, b) -> Integer.compare(a[0], b[0]));
        int[] result = new int[m];
        Map<Integer, Integer> freqMap = new HashMap<>();
        int left = 0, right = 0;
        for (int[] queryPair : queryPairs) {
            int queryTime = queryPair[0];
            int queryIndex = queryPair[1];
            int start = queryTime - x;
            while (right < logs.length && logs[right][1] <= queryTime) {
                freqMap.put(logs[right][0], freqMap.getOrDefault(logs[right][0], 0) + 1);
                right++;
            }
            while (left < logs.length && logs[left][1] < start) {
                int serverId = logs[left][0];
                freqMap.put(serverId, freqMap.get(serverId) - 1);
                if (freqMap.get(serverId) == 0) {
                    freqMap.remove(serverId);
                }
                left++;
            }
            result[queryIndex] = n - freqMap.size();
        }
        return result;
    }
}