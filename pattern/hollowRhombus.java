import java.util.Scanner;

public class hollowRhombus {
    public static void printHollowRhombus(int row){
        for(int i=1;i<=row;i++){
            //spaces
            for(int j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            //Hollow Rectangle
            for(int j=1;j<=row;j++){
                if(i==1 || i==row || j==1 || j==row){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        printHollowRhombus(row);
        sc.close();
    }
}
