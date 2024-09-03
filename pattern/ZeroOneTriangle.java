import java.util.Scanner;

public class ZeroOneTriangle{
    public static void printZeroOneTriangle(int row){
        //Outer Loop for defining total rows/line to be printed
        for(int i=1;i<=row;i++){
            //Inner Loop for printing 0 & 1
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        printZeroOneTriangle(row);
        sc.close();
    }
}