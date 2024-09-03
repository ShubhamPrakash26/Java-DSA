import java.util.Scanner;

public class floydsTriangle {
    public static void printFloydsTriangle(int row){

        int counter = 1;    //Initialising a counter for Printing Numbers
        
        //Outer Loop for defining total rows to be printed
        for(int i=1; i<=row;i++){
            //Inner Loop for printing the numbers till the condition,i.e., j<=i
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;                  //Updating Counter after printing the number once
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        printFloydsTriangle(row);
        sc.close();
    }
}
