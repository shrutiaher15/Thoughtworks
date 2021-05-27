import java.util.Scanner;

public class MangoTreeChecker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of Rows:");
        int rows = sc.nextInt();

        System.out.println("Enter No. of Columns:");
        int columns = sc.nextInt();

        int treeNumber;

        System.out.println("Enter No. of tree:");
        treeNumber = sc.nextInt();

        if(treeNumber <= 0 || treeNumber > rows * columns)
            System.out.println("Enter valid tree number");

        else if(isMangoTreePresent(rows, columns, treeNumber))
            System.out.println("Tree " + treeNumber + " Present");

        else
            System.out.println("Tree " + treeNumber + " Not Present");
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
        return (treeNumber % columns == 1);
    }

}
