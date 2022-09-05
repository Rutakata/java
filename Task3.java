import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the matrix: ");
        int matrixSize = sc.nextInt();


        int[][] matrix = createMatrix(matrixSize);

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        findPositive(matrix, matrixSize);
    }

    private static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(-51, 51);
            }
        }

        return matrix;
    }

    private static void findPositive(int[][] matrix, int n) {
        int positiveCount = 0;
        int positiveSum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (matrix[i][j] > 0) {
                    positiveCount++;
                    positiveSum += matrix[i][j];
                }
            }
        }

        System.out.println("NUmber of positive numbers: " + positiveCount);
        System.out.println("Sum of positive numbers: " + positiveSum);
    }
}
