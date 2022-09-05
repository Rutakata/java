import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size n: ");
        int n = sc.nextInt();
        System.out.print("Enter size m: ");
        int m = sc.nextInt();

        int[][] matrix = createMatrix(n, m);

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        int[] positiveSumArr = countRowsPositiveSum(matrix, n, m);

        System.out.println("=======Resut=======");
        replaceRows(matrix, n, m, positiveSumArr);
    }

    private static int[][] createMatrix(int n, int m) {
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(-50, 51);
            }
        }

        return matrix;
    }

    private static int[] countRowsPositiveSum(int[][] matrix, int n, int m) {
        int[] positiveSumArr = new int[n];

        for (int i = 0; i < n; i++) {
            int positiveSum = 0;
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] > 0 && (matrix[i][j] % 2 == 0)) {
                    positiveSum += matrix[i][j];
                }
            }
            positiveSumArr[i] = positiveSum;
        }
        
        return positiveSumArr;
    }

    private static void replaceRows(int[][] matrix, int n, int m, int[] positiveSumArr) {
        int[][] replacedMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            int max = 0;

            for (int j = 0; j < n; j++) {
                if (positiveSumArr[j] >= positiveSumArr[max]) {
                    max = j;
                }
            }
            replacedMatrix[i] = matrix[max];
            positiveSumArr[max] = -1;
        }

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(replacedMatrix[i][j] + " ");
            }
        }
    }
}
