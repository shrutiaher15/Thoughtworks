import java.util.Scanner;

public class CollatzSequenceGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber;

        System.out.println("First Number:");
        firstNumber = sc.nextInt();

        generateCollatzSequence(firstNumber);
    }


    // method to generate collatz sequence.
    public static void generateCollatzSequence(int n){

        while(n > 1){
            System.out.print(n + " -> ");

            if(n % 2 == 0){
                n /= 2;
            }
            else{
                n = (3 * n) + 1;
            }
        }
        
        System.out.print(n);
    }
}
