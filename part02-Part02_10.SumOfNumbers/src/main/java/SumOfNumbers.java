
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int total = 0;

        while(true){
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());

            if(num != 0){
                total = total + num;
            }else{
                break;
            }
        }
        System.out.println("Sum of the numbers: " + total);

    }
}
