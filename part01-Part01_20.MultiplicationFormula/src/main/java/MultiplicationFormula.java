
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());

        int sum = firstNum * secondNum;

        System.out.println(firstNum + " * " + secondNum + " = " + sum);

    }
}
