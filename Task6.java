import java.util.Scanner;


public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String findStr = "auto";
        int lastIndex = 0;
        int count = 0;

        System.out.print("Enter text: ");
        String textForSearch = sc.nextLine();

        while (lastIndex != -1) {
            lastIndex = textForSearch.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }

        System.out.println("Number of entries: " + count);
    }
}
