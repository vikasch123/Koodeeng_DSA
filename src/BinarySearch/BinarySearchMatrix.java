public class BinarySearchMatrix {

    static public boolean searchMatrix(int[][] matrix, int target) {
        // Handle empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int lo = 0;
        int hi = rows * cols - 1;

        return searchBinary(matrix, rows, cols, target, lo, hi);
    }

    static public boolean searchBinary(int[][] matrix, int rows, int cols, int target, int lo, int hi) {
        // Base case for binary search
        if (lo > hi) {
            return false;
        }

        int mid = lo + (hi - lo) / 2;

        // Get matrix value at mid
        int midValue = matrix[mid / cols][mid % cols];

        if (midValue == target) {
            return true;
        } else if (target > midValue) {
            return searchBinary(matrix, rows, cols, target, mid + 1, hi);
        } else {
            return searchBinary(matrix, rows, cols, target, lo, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 4, 8 }, { 10, 11, 12, 13 }, { 14, 20, 30, 40 } };
        System.out.println(searchMatrix(matrix, 20)); // true
        System.out.println(searchMatrix(matrix, 21)); // false
    }
}
