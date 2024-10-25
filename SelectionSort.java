public class SelectionSort {
    public static void main(String[] args) {
        Sorting sr = new Sorting();
        int arr[] = {4, 1, 3, 9, 7};
        int N = arr.length;
        sr.selectionSort(arr, N);
        for(int i=0;  i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class Sorting{
    int  select(int arr[], int i){
        int index =i;
       for(int j= i+1; j< arr.length; j++){
            if(arr[index]>arr[j]){
                index = j;
            }
       }
       return index;
	}
	void selectionSort(int arr[], int n){
        for(int i=0; i<n-1 ;i++){
            int ind = select(arr, i);
            int temp = arr[ind];
            arr[ind]= arr[i];
            arr[i] = temp;
        }
	}
}