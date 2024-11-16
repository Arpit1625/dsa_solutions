import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List <Integer>lii = new ArrayList<>();
        lii = spiralOrder(arr);
        for(int i=0;i<lii.size();i++){
            System.out.print(lii.get(i) + " ");
        }
    }
    static List<Integer>  spiralOrder(int[][] matrix){
        List <Integer> li = new ArrayList<>();
        // int m= matrix.length*matrix[0].length;
        int left = 0 ,top =0;
        int right = matrix[0].length-1;
        int bottom =  matrix.length -1;
        // in while condition we can also use li.size() <= m
        while(bottom >= top && left <= right){
            for(int i=left; i<=right; i++){
                 li.add(matrix[top][i]);
            }
            top++ ;
            for(int i= top; i<=bottom; i++){
                li.add(matrix[i][right]);
           }
           right--;
        if(top <= bottom){
           for(int i=right; i>=left; i--){
            li.add(matrix[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom; i>=top; i--){
                li.add(matrix[i][left]);
            }
            left ++;
        }
        }
        return li; 
    }
}
