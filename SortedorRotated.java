public class SortedorRotated {
    public static boolean IsSortedAndRotated(int arr[]){
        int breakpoint = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                breakpoint++;
            }
        }
      if(breakpoint>1){
        return false;
      }
      return true;
    }
    public static void main(String[] args) {
        int arr1[] = {3,4,5,1,2};
        int arr2[]= {1,2,3};
        int arr3[]= {2,1,4,3};
        int arr4[] = {2,1,3,4};
        int arr5 []= {2,3,4,1};

        boolean a = IsSortedAndRotated(arr3);
        System.out.print(a);
    }
}
