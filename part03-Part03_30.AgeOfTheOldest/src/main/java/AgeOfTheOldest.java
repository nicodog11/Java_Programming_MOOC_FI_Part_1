
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        int oldest = 0;

        while(true) {
            String userInput = scanner.nextLine();
            
            if (userInput.equals("")){
                break;
            }

            String[] splitStringArray = userInput.split(",");

            age = Integer.valueOf(splitStringArray[1]);


            if (age > oldest){
                oldest = age;
            }
            
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
