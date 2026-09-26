// package BinarySearch;

public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = row * col - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midRow = mid / col;
            int midCol = mid % col;
            if (matrix[midRow][midCol] == target)
                return true;
            else if (matrix[midRow][midCol] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 5, 9 },
                { 14, 20, 21 },
                { 30, 34, 43 }
        };
        int target = 24;
        System.out.println(searchMatrix(matrix, target));
    }
}
