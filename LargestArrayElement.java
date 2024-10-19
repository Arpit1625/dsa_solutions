public class LargestArrayElement {
    public static int findLargest(int arr[]){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
              max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr []= {1, 8, 7, 56, 90};
        int a = findLargest(arr);
        System.out.print("Largest element in the array is "+a);
    }
}
