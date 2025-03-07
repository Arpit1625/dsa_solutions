public class MinDist {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(getMinDistance(arr , 5, 3));
    }
    static int getMinDistance(int[] nums, int target, int start) {
        int minDistance = Integer.MAX_VALUE;
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] == target) {
               int currentDistance = Math.abs(i - start);
               if (currentDistance < minDistance) {
                   minDistance = currentDistance;
                   if (minDistance == 0) {
                       return 0;
                   }
               }
           }
       }
       return minDistance;
   }
}
