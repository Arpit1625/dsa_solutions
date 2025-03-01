import java.util.ArrayList;
class SumTriangle {
    public static void main(String[] args) {
        int arr[] = {4,7,3,6,7};
        ArrayList <Integer> li = new ArrayList<>();
        li = constructTriangle(arr);
        for(int i =0; i<li.size() ; i++){
            System.out.print(li.get(i) + " ");
        }
    }
    static ArrayList<Integer> constructTriangle(int[] arr) {
        int n = arr.length;
        int totalElements = n * (n + 1) / 2;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < totalElements; i++) {
            result.add(0);
        }
        int MOD = 1000000007;
        for (int i = 0; i < n; i++) {
            result.set(totalElements - n + i, arr[i]);
        }
        int rowStart = totalElements - n;
        for (int rowLength = n - 1; rowLength > 0; rowLength--) {
            int prevRowStart = rowStart - rowLength; 
            for (int i = 0; i < rowLength; i++) {
                int sum = (result.get(rowStart + i) + result.get(rowStart + i + 1)) % MOD;
                result.set(prevRowStart + i, sum);
            }
            rowStart = prevRowStart; 
        }
        return result;
    }
}