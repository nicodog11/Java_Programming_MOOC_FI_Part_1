
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        int oldest = 0;
        String name = "";
        String longestName = "";

        int sum = 0;
        int count = 0;

        while(true) {
            String userInput = scanner.nextLine();
            
            if (userInput.equals("")){
                break;
            }

            String[] splitStringArray = userInput.split(",");

            age = Integer.valueOf(splitStringArray[1]);
            name = splitStringArray[0];

            if (name.length() > longestName.length()){
                longestName = name;
            }

            sum = sum + age;
            count = count + 1;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
