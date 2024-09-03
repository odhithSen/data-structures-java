package Array;

public class TwoDArray {
    public static void main(String[] args) {

        // 1. Declare and initialize a 2D array with predefined values
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Declare a 2D array and then initialize it
        int[][] grid = new int[3][3]; // 3x3 grid
        // Populate the array
        grid[0][0] = 1;
        grid[0][1] = 2;

        System.out.println(matrix[2][1]);

        // 2. Traversing a 2D array
        // Using for loops
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Using enhanced for loop
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // 3. Declare and initialize a 3D array
        int[][][] threeDArray = {
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 }
                },
                {
                        { 7, 8, 9 },
                        { 10, 11, 12 }
                }
        };

        System.out.println(threeDArray[1][0][2]);

    }
}
