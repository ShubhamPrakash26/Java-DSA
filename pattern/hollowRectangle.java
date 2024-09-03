import java.util.Scanner;

public class hollowRectangle {

    public static void hollow_rectangle(int rows, int cols){
        //Outer Loop for defining total no. of rows
        for(int i=1;i<=rows;i++){
            //Inner loop for defining total no. of columns to be traversed
            for(int j=1; j<=cols;j++){
                //Condition for checking the Boundary Condition
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter Cols: ");
        int col = sc.nextInt();
        hollow_rectangle(row, col);
        sc.close();
    }
}

