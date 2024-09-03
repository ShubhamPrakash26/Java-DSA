import java.util.Scanner;

public class invertedAndRotatedHalfPyramid {
    public static void inverted_Rotated_Half_Pyramid(int row){
        //Outer Loop for defining total no. of rows to be printed
        for(int i=1;i<=row;i++){
            //Inner loop for printing Spaces First
            for(int j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            //Inner Loop for printing Star after spaces
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();       //Printing Next Line after each complete iteration
        }
    }
    public static void PyramidPattern(int row){
        int i = 1;
        while (i <= row) {
            int sp = 1;
            while (sp <= (row - i)) {
                System.out.print(" "); 
                sp++;
            }
            sp = 1; 
            while (sp <= i) {
                System.out.print("*");
                sp++;
            }
            System.out.println(); // Printing Next Line after each complete iteration
            i++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        // inverted_Rotated_Half_Pyramid(row);
        PyramidPattern(row);
        sc.close();
    }
}

/* 

    *
   **
  ***
 ****
***** 

*/
