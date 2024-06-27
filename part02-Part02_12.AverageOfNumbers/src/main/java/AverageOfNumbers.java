
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int count = 0;
        int sum = 0;
        double average = 0;

        while(true){
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());

            if(num == 0){
                break;
            }else{
                sum = sum + num;
                count = count + 1;
                average = sum / count;
                //System.out.println(sum);
                //System.out.println(count);
                //System.out.println(average);
                
            }
        }
        average = sum / (double)count;
        System.out.println(sum + "/" + count);
        System.out.println("Average of the numbers: " + average);


    }
}
