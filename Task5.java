import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text for correction: ");
        String rawText = sc.nextLine();
        rawText = rawText.replaceAll("(?<=[,])(?!$)", " ");
        System.out.println();
        System.out.println(rawText);
    }
}
