import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(arr,k));
    }
    static int subarraySum(int []arr,int k){
        HashMap <Integer, Integer> hm = new HashMap<> ();
        int sum =0;
        int count = 0;
        hm.put(0,1);
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            int remove = sum -k;
            count += hm.getOrDefault(remove,0);
            hm.put(sum , hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
