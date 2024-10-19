public class SecondLargest {
    public static int SecondlargestEle(int arr[]){
        int max =arr[0];
        int secondmax= 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i]>secondmax && arr[i]< max){
                secondmax = arr[i];
            }
        } 
        if(secondmax==0){
            return -1;
        }
        return secondmax;
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int a = SecondlargestEle(arr);
        System.out.println("Second Largest Element in Array is "+a);
    }
}
