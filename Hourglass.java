public class Hourglass {
    public static void main(String[] args) {
        int[][] grid = {
            {-1, -1,  0, -9, -2, -2},
            {-2, -1, -6, -8, -2, -5},
            {-1, -1, -1, -2, -3, -4},
            {-1, -9, -2, -4, -4, -5},
            {-7, -3, -3, -2, -9, -9},
            {-1, -3, -1, -2, -4, -5}
        };
        
        System.out.println(getHourGlassSum(grid));
    }
    public  static int getHourGlassSum(int arr[][]){
        int row = 0 ;
        int size = arr.length-1;
        int max = Integer.MIN_VALUE;
        while(row <= size - 2){
            int col = 0 ; 
            while (col <= size -2) {
                int sum = getSumOfRow(arr, row, col, col+2) + arr[row+1][col+1] + getSumOfRow(arr, row+2, col, col+2);
                if(max<sum)max=sum;
                col++;
           }
           row++ ;
        }
        return max;
    }

    public static int getSumOfRow(int arr[][] , int row ,int colBegin , int colEnd){
        int sum = 0 ;
        while (colBegin<=colEnd) {
            sum+= arr[row][colBegin];
            colBegin++ ;
        }
        return sum ;
    }
}
