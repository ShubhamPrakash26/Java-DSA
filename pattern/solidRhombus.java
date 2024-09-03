import java.util.Scanner;

public class solidRhombus {
    public static void printRhombus(int row){
        //Outer Loop for printing total no. of rows
        for(int i=1; i<=row;i++){
            //Inner Loop for printing Spaces first
            for(int j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            //Inner Loop for printing total no. of stars  --> row
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        printRhombus(row);
        sc.close();
    }
}
