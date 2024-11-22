import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,0,0};
        int m =3;
        int arr1[] = {2,5,6};
        int n= 3;
        merge(arr, m, arr1, n);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        else if(m==0){
            for(int i=0; i<nums2.length; i++){
                nums1[i] = nums2[i];    
            }
            return;      
        }
        int j=0;
        for(int i=m; i<m+n; i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);

    }
}
