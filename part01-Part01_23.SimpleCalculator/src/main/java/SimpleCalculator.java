
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());

        int addition = firstNum + secondNum;
        int subtraction = firstNum - secondNum;
        int multiply = firstNum * secondNum;
        double division = (double) firstNum / secondNum;

        System.out.println(firstNum + " + " + secondNum + " = " + addition);
        System.out.println(firstNum + " - " + secondNum + " = " + subtraction);
        System.out.println(firstNum + " * " + secondNum + " = " + multiply);
        System.out.println(firstNum + " / " + secondNum + " = " + division);

    }
}
