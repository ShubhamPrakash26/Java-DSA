import java.util.Scanner;

public class diamondPattern {
    public static void printDiamond(int n){

        //for 1st part
        //Outer Loop for total rows to be printed
        for(int i=1;i<=n;i++){
            //Inner Loop for first Spaces since spaces are decreasing
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //Inner Loop for star, since odd number of stars are printed,i.e., 2n-1 is for odd
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Outer Loop for total rows to be printed
        for(int i=n;i>=1;i--){
            //Inner Loop for first Spaces since spaces are decreasing
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //Inner Loop for star, since odd number of stars are printed,i.e., 2n-1 is for odd
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        printDiamond(n);
        sc.close();
        
    }
}
