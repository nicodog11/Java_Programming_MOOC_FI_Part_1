
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int total = 0;

        while(true){
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());

            if(num != 0 && num < 0){
                total = total + 1;
            }else if(num > 0){
                continue;
            }else{
                break;
            }
        }
        System.out.println("Number of negative numbers: " + total);
    }
}
