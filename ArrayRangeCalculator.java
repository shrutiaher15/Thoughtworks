import java.util.Arrays;
import java.util.Scanner;

public class ArrayRangeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("The range of the array is " + findRange(array, arraySize));
    }

    public static int findRange(int[] array, int arraySize){
        Arrays.sort(array);
        return array[arraySize - 1] - array[0];
    }
}
