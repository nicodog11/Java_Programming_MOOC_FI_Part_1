

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
        printUntilNumber(2);
    }

    public static void printUntilNumber(int number) {
        int i = 0;
        while(i < number){
            //number += 1;
            i++;
            System.out.println(i);
        }
    }

}
