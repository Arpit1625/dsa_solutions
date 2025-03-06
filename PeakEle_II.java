public class PeakEle_II {
    public static void main(String[] args) {
        int arr[][]= {{1,4},{3,2}};
        int arr1[] = findPeakGrid(arr);
        for(int num : arr1){
            System.out.print(num + " ");
        }
    }
    static int[] findPeakGrid(int[][] mat) {
        int left = 0, right = mat[0].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int maxRow = findMaxRow(mat, mid);
            int current = mat[maxRow][mid];
            boolean leftCheck = true, rightCheck = true;
            if (mid > 0) {
                leftCheck = current > mat[maxRow][mid - 1];
            }
            if (mid < mat[0].length - 1) {
                rightCheck = current > mat[maxRow][mid + 1];
            }
            if (leftCheck && rightCheck) {
                return new int[]{maxRow, mid};
            } else if (!leftCheck) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int findMaxRow(int[][] mat, int col) {
        int maxRow = 0;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > mat[maxRow][col]) {
                maxRow = i;
            }
        }
        return maxRow;
    }
}
