
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int count = 0;
        int sum = 0;

        while(true){
            num = Integer.valueOf(scanner.nextLine());

            if(num == 0){
                break;
            }else if(num < 0){
                continue;
            }else{
                sum += num;
                count++;
            }
        }
        if(sum > 0){
            System.out.println(sum/(double)count);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
