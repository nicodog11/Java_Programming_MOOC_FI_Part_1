
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            String[] splitStringArray = userInput.split(" ");

            int lastElement = splitStringArray.length - 1;

            System.out.println(splitStringArray[lastElement]);

            if (userInput.equals("")) {
                break;
            }
        }

    }
}
