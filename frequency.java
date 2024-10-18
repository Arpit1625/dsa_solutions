import java.util.HashMap;
public class frequency {
    public static void main(String[] args) {
       int  arr[] = {2, 3, 2, 3, 5};
       int N = 5;
       int P = 5;
       frequency.findFrequency(arr, N, P);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void findFrequency(int arr[], int N , int P){
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // for(int i= 1; i<=N;  i++){
        //     hm.put(i,0);
        // }
        // for(int i=0; i<arr.length; i++){
        //     if(hm.get(arr[i])!= null){
        //         hm.put(arr[i],hm.get(arr[i])+1);
        //     }
        // }
        // int j=1;
        // for(int i =0; i<arr.length; i++){
        //      arr[i] = hm.get(j);
        //      j++;
        int arr1[] = new int[arr.length]; 
        for(int i=0; i<arr.length ; i++){
            if(arr[i]<=N){
                arr1[arr[i]-1]+= 1;
            }
    }
    for(int i=0; i< arr.length; i++){
        arr[i] = arr1[i];
    }
}
}
