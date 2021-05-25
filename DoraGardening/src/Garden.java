import java.util.Scanner;

public class Garden {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of Rows:");
        int rows = sc.nextInt();

        System.out.println("Enter No. of Columns:");
        int columns = sc.nextInt();

        System.out.println("Mango trees in Garden:");
        printGardenView(rows, columns);

        int treeNumber;

        while(true){
            System.out.println("Enter No. of tree(-1 to stop):");
            treeNumber = sc.nextInt();

            if(treeNumber == -1)
                break;

            if(treeNumber <= 0 || treeNumber > rows * columns){
                System.out.println("Enter valid tree number");
                continue;
            }

            if(isMangoTreePresent(rows, columns, treeNumber))
                System.out.println("Present");
            else
                System.out.println("Not Present");
        }
    }

    // method to check whether mango tree is present or not.
    public static boolean isMangoTreePresent(int rows, int columns, int treeNumber){
        return isInFirstRow(columns,treeNumber) || isInFirstCol(rows,columns,treeNumber)
                || isInLastCol(rows,columns,treeNumber);
    }


    // tree is in first row if it is less than no. of columns.
    public static boolean isInFirstRow(int columns, int treeNumber){
        return treeNumber <= columns && treeNumber >= 0;
    }

    // tree is in last column if it is multiple of number of columns
    // and less than equal to total no. of trees.
    public static boolean isInLastCol(int rows, int columns, int treeNumber){
        return (treeNumber % columns == 0) && (treeNumber <= rows * columns);
    }

    // tree is in first column if it is equal to 1 or equal to 1 + no. of columns.
    public static boolean isInFirstCol(int rows,int columns,int treeNumber){
        int i = 0;

        if(treeNumber == 1)
            return true;

        while(i < rows){
            if(treeNumber == 1 + columns)
                return true;

            columns += columns;
            i++;
        }

        return false;
    }

    // method to print location of mango trees in garden.
    public static void printGardenView(int rows, int columns){

        // counter to index trees in garden.
        int counter = 1;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){

                if(isMangoTreeLocation(i, j, rows, columns))
                    System.out.print(counter + " ");
                else
                    System.out.print("_ ");

                counter++;
            }
            System.out.println();
        }

        System.out.println();
    }

    // method to check location of mango tree.
    public static boolean isMangoTreeLocation(int i, int j, int rows, int columns){
        return (i == 0 && j < columns) || (i < rows && j == 0) ||
                (i < rows && j == columns - 1);
    }
}
