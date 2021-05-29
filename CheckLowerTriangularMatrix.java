import java.util.Scanner;

public class CheckLowerTriangularMatrix {

    public static boolean isLowerTriangular(int[][] squareMatrix, int dimension){
        for (int i = 0; i < dimension; i++){
            for (int j = i + 1; j < dimension; j++){
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

            System.out.println(isLowerTriangular(squareMatrix, rows)?"yes":"no");
        }
    }
}
