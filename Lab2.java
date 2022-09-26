import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        int matrixSize = 0;

        System.out.print("Enter matrix size: ");

        while (true) {
            try {
                matrixSize = Integer.parseInt(sc.next());
                if (matrixSize < 0) {
                    System.out.print("Wrong size. Enter again: ");
                    continue;
                }
                break;
            }catch(NumberFormatException exception) {
                System.out.print("Wrong value. Enter again: ");
                continue;
            }
        }

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");

                while (true) {
                    try {
                        int matrixElement = Integer.parseInt(sc.next());
                        matrix[i][j] = matrixElement;
                        break;
                    }catch(NumberFormatException exception) {
                        System.out.print("Wrong input. Enter again: ");
                        continue;
                    }
                }
                
            }
        }

        // for (int i = 0; i < matrixSize; i++) {
        //     for (int j = 0; j < matrixSize; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < matrixSize; i++) {
            if (matrix[i][i] % 2 == 0 && matrix[i][i] > maxNumber) {
                maxNumber = matrix[i][i];
            }
        }
        if (maxNumber == Integer.MIN_VALUE) {
            System.out.println("No even number in main diagonal");
        }else {
            System.out.println("Max even number in main diagonal: " + maxNumber);
        }
    }
}
