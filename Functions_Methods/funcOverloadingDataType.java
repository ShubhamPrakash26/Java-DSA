import java.util.Scanner;

public class funcOverloadingDataType {
    //Function to calculate sum of 2 numbers
    public static int sum(int a, int b){
        return a+b;
    }
    
    //Function to calculate sum of 2 float
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.print("Enter C: ");
        float c = sc.nextFloat();
        System.out.print("Enter D: ");
        float d = sc.nextFloat();
        System.out.println("Sum of Two Int: " + sum(a,b));
        System.out.println("Sum of Two Float : " + sum(c,d));
        sc.close();
    }
}
