
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        int oldest = 0;
        String name = "";
        String oldestName = "";

        while(true) {
            String userInput = scanner.nextLine();
            
            if (userInput.equals("")){
                break;
            }

            String[] splitStringArray = userInput.split(",");

            age = Integer.valueOf(splitStringArray[1]);
            name = splitStringArray[0];

            if (age > oldest){
                oldest = age;
                oldestName = name;
            }
            
        }
        System.out.println("Name of the oldest: " + oldestName);


    }
}
