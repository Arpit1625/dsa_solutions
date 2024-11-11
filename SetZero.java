import java.util.ArrayList;
public class SetZero {
    public static void main(String[] args) {
        int arr [] [] = {{1,0,2,4},{3,4,5,2},{1,3,0,5}};
        setZeroes(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }
    static void setZeroes(int[][] matrix) {
        ArrayList <Integer> li = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    li.add(i);
                    li.add(j);
                }
            }
        }
        for(int i=0;i<li.size();i+=2){
            setRowZeroes(matrix,li.get(i));
            setColZeroes(matrix,li.get(i+1));
        }
    }
    static void setRowZeroes (int[][] arr, int row){
        for(int i=0;i<arr[0].length; i++){
            arr[row][i] = 0;
        }
    }
    static void setColZeroes (int[][] arr , int column){
        for(int i=0; i< arr.length; i++){
            arr[i][column] = 0;
        }
    }
}
