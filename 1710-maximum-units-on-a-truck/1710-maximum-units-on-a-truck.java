class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = new int[boxTypes.length];
        for (int i = 0; i < boxTypes.length; i++) {
            arr[i] = boxTypes[i][1];
            hm.put(boxTypes[i][1] , hm.getOrDefault(boxTypes[i][1], 0) + boxTypes[i][0]);
        }
        Arrays.sort(arr);
        int ans = 0;
        int i = arr.length - 1;
        while (truckSize > 0 && i >= 0) {
            if (truckSize < hm.get(arr[i])) {
                int sum = arr[i] * truckSize;
                // System.out.println("sum" + sum);
                ans += sum;
                truckSize = truckSize - hm.get(arr[i]);
                i--;
            } else {
                int sum = arr[i] * hm.get(arr[i]);
                // System.out.println(arr[i] + " " + hm.get(arr[i]));
                ans += sum;
                truckSize = truckSize - hm.get(arr[i]);
                hm.put(arr[i] , 0);
                // System.out.println(truckSize);
                i--;
            }
        }
        return ans;
    }
}