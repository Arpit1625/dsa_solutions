public class InsertionSort {
    public static void main(String[] args) {
    InsertionSorting is = new InsertionSorting();
    int arr [] =  {95 ,13 ,47 ,52 ,41 ,68 ,42};
    int N = arr.length;
    is.insertionSort(arr, N);
    for(int i=0; i<N; i++){
        System.out.print(arr[i]+" ");
    }
    }
}
class InsertionSorting{
    static void insert(int arr[],int i){
        for(int j =i; j>0 ; j--){
            if(arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] =  arr[j-1];
                arr[j-1] = temp; 
            }
        }
    }
    public void insertionSort(int arr[], int n){
      for(int i=1; i<n ; i++){
        insert(arr, i);
      }
    }
}