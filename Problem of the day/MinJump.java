public class MinJump{
    public static void main(String[] args) {
        int arr[] = {0, 10, 20};
        System.out.println(minJumps(arr));
    }
    static int minJumps(int[] arr) {
        //    int i = 0; it fails since we can jump from from i to that index but we can also use indexexes between them
        //    int ans = 0;
        //    while(i <= arr.length-1){
        //     if(arr[i] == 0){
        //         return -1;
        //     }
        //     ans++;
        //     i = i + arr[i]; 
        //    }
        //    return ans;
        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        if (arr[0] == 0){
            return -1;
        }
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                if (currentEnd >= n - 1) {
                    return jumps;
                }
            }
            if (i >= farthest) {
                return -1;
            }
        }
        return -1;
    }
}