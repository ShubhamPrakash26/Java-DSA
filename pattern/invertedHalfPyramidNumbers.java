import java.util.Scanner;

public class invertedHalfPyramidNumbers {
    public static void inverted_Hlaf_Pyramid_Numbers(int row){
        
        //Outer Loop for checking total rows to be printed
        for(int i=1; i<=row;i++){
            
            //Inner Loop for printing Numbers, i.e., num = row-i+1
            for(int j=1;j<=(row-i+1);j++){
                System.out.print(j);
            }

            System.out.println();           //Printing Next Line
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        inverted_Hlaf_Pyramid_Numbers(row);
        sc.close();
    }
}
/* 
For row = 5{
12345
1234
123
12
1
}
*/
