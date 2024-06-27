
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide a number");

        int number = Integer.valueOf(scanner.nextLine());
        int squared = number * number;
        System.out.println(squared);

    }
}
