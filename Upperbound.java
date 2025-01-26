import java.util.Arrays;

public class Upperbound {
    public static void main (String args[]){
        int arr[] = {23,61,47,84,35,43,15,29,84};
        int x = 1;
        int ar[] = getFloorandCeil(x, arr);
        System.out.print (ar[0] + " " + ar[1]);
    }
    static int[] getFloorandCeil(int x ,int arr[]){
        Arrays.sort(arr);
        int floor = -1;
        { 
        int min = 0;
        int max = arr.length-1;
        if(x < arr[0]){
            floor = -1;
        }
        else{
        while(min <= max){
            int mid =  min+(max-min)/2;
            if(arr[mid] == x){
               floor = arr[mid];
               break;
            }
            else if(arr[mid] < x){
                floor = arr[mid];
                min = mid +1;
            }
            else if(arr[mid]>x){
                max = mid-1;
            }
        }
        }
    }
        int ceil = -1;
        {
        if(arr[arr.length-1]< x){
            ceil = -1;
        }
        else{
            int min = 0;
            int max = arr.length -1;
            while (min <= max){
                int  mid = min + (max-min) /2;
                if(arr[mid] == x){
                    ceil = arr[mid];
                    break;
                }
                else if(arr[mid] < x){
                    min = mid+1;
                }
                else{
                    ceil = arr[mid];
                    max = mid-1;
                }
            }
        }
    }
        return new int[]{floor,ceil};
    }
}