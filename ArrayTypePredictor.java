import java.util.Scanner;

public class ArrayTypePredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            array[i] = sc.nextInt();
        }

        if(findArrayType(array, arraySize) == 1)
            System.out.println("The array is Even");
        else if(findArrayType(array, arraySize) == 2)
            System.out.println("The array is Odd");
        else if(findArrayType(array, arraySize) == 3)
            System.out.println("The array is Mixed");

    }

    public static int findArrayType(int[] array, int arraySize){
        if(isArrayEven(array))
            return 1;
        if(isArrayOdd(array))
            return 2;
        return 3;
    }

    public static boolean isArrayEven(int[] array){
        for(int i: array){
            if(i % 2 != 0)
                return false;
        }
        return true;
    }

    public static boolean isArrayOdd(int[] array){
        for(int i : array){
            if(i % 2 == 0)
                return false;
        }
        return true;
    }
}
