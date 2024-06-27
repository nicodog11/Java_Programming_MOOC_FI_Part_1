

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
        printFromNumberToOne(2);
    }

    public static void printFromNumberToOne(int number) {
        //int i = 0;
        while(number > 0){
            //number += 1;
            System.out.println(number);
            number --;
        }
    }

}
