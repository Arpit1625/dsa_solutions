public class Lowerbound {
    public static void main (String args[]){
        int arr[] = {1, 2, 8, 10, 11, 12, 19} ;
        int k = 9;
        int lower_bound = findFloor(arr, k);
        System.out.print(lower_bound);
    }
    static int findFloor(int arr[] , int k){
        int min = 0;
        int max = arr.length-1;
        while(min <= max){
            int mid =  min+(max-min)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                if(arr[mid+1]>k){
                    return mid;
                }
                else{
                    min = mid + 1;
                }
            }
            else if(arr[mid]>k){
                max = mid-1;
            }
        }
        return -1;
    }
}

