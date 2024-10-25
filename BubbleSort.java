public class BubbleSort {
    public static void main(String[] args) {
        bubbleSorting bb = new bubbleSorting();
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        bb.bubbleSort(arr, n);
        for(int i=0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
class bubbleSorting{
    void bubbleSort(int []arr , int n){
        for(int i=n-1; i>=0 ; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
