package Arrays;
public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        int n = matrix.length; 

        //  Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //  Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        // Print matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        

    }
    public static void main(String[] args) {
        int[][] matrix = {
            {7, 5, 4},
            {3, 6, 8},
            {1, 9, 2}
        };
        rotate(matrix);
    }
}
