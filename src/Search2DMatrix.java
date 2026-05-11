public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = 0;
        int j = rows * cols - 1;

        while (i <= j) {

            int mid = (i + j) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            }

            else if (matrix[row][col] < target) {
                i = mid + 1;
            }

            else {
                j = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Search2DMatrix obj = new Search2DMatrix();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        System.out.println("Target Found: " +
                obj.searchMatrix(matrix, 11));
    }
}