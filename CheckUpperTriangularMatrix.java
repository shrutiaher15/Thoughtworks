import java.util.Scanner;

public class CheckUpperTriangularMatrix {

    public static boolean isUpperTriangular(int[][] squareMatrix, int dimension){
        for (int i = 1; i < dimension; i++){
            for (int j = 0; j < i; j++){
                if (squareMatrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rows:");
        int rows = sc.nextInt();

        System.out.println("Columns:");
        int columns = sc.nextInt();

        if(rows == columns){
            int[][] squareMatrix = new int[rows][columns];
            System.out.println("Matrix Elements:");

            for (int i = 0; i < rows; i++){
                for (int j = 0; j < columns; j++){
                    squareMatrix[i][j] = sc.nextInt();
                }
            }

            System.out.println(isUpperTriangular(squareMatrix, rows)?"yes":"no");
        }
    }
}
