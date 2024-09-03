import java.util.Scanner;

public class butterflyPattern {
    public static void printButterflyPattern(int n){
        //Outer Loop for defining no. of rows to be printed in first half
        for(int i=1; i<=n;i++){
            //Inner Loop for printing Stars first, i.e., i stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //Inner Loop for printing spaces, i.e., 2(n-i) spaces
            for(int j=1; j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            
            //Inner Loop for printing star again, i.e., i stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //For printing 2nd Half of the Pattern
        for(int i=n; i>=1;i--){
            //Inner Loop for printing Stars first, i.e., i stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //Inner Loop for printing spaces, i.e., 2(n-i) spaces
            for(int j=1; j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            
            //Inner Loop for printing star again, i.e., i stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        printButterflyPattern(row);
        sc.close();
    }
}
