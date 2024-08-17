import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i = 1; i < array.length; i++){
            // If the current element is smaller, update smallest
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        // write your code here
        int indexOfSmallest = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[indexOfSmallest])
            indexOfSmallest = i;
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int indexOfSmallest = startIndex;
        for(int i = startIndex; i < table.length; i++){
            if(table[i] < table[indexOfSmallest])
            indexOfSmallest = i;
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int indexTemp = array[index1];

        array[index1] = array[index2];
        array[index2] = indexTemp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            int startIndex = indexOfSmallestFrom(array, i);
            swap(array, startIndex, i);
        }
    }
}
