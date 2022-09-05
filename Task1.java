import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();

        String result = checkEquationRoots(a, b);
        System.out.println(result);
    }

    private static String checkEquationRoots(int a, int b) {
        if (a == 0 && b == 0) {
            return "Рівняння має безліч розв'язків";
        }else if (a == 0 && b != 0) {
            return  "Рівняння розв'язків не має";
        }else if (a != 0 && b == 0) {
            return "Єдиний розв'язок рівняння - 0";
        } else {
            int root = (b*(-1))/a;
            String result = "Розв'язок рівняння - " + root;
            return result;
        }           
    }
}