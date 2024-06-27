
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Second Number");
        int secondNum = Integer.valueOf(scanner.nextLine());

        double squared = Math.sqrt(firstNum + secondNum);
        System.out.println(squared);
    }
}
