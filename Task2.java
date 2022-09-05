import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = sc.nextInt();

        System.out.print("Enter a border: ");
        int aBorder = sc.nextInt();

        System.out.print("Enter b border: ");
        int bBorder = sc.nextInt();

        int[] numbersArray = new int[arrayLength];

        numbersArray = fillInArray(numbersArray, arrayLength);
        System.out.println("==========Start array=========");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println("");
        System.out.println("==========Result=========");
        numbersArray = checkArrayValues(numbersArray, arrayLength, aBorder, bBorder);
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(numbersArray[i] + " ");
        }
    }

    private static int[] fillInArray(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 101);
        }

        return array;
    }

    private static int[] checkArrayValues(int[] array, int length, int aBorder, int bBorder) {
        int[] changedArray = new int[length];
        changedArray = array;
        for (int i = 1; i < length - 1; i++) {
            if (array[i] > aBorder && array[i] < bBorder && (array[i] % 2  == 0)) {
                changedArray[i] = array[i - 1] + array[i + 1];
            }
        }

        return changedArray;
    }
}
