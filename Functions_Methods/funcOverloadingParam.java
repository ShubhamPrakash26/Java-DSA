import java.util.Scanner;

public class funcOverloadingParam {

    //Function to calculate sum of 2 numbers
    public static int sum(int a, int b){
        return a+b;
    }
    
    //Function to calculate sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.print("Enter C: ");
        int c = sc.nextInt();
        System.out.println("Sum of Two: " + sum(a,b));
        System.out.println("Sum of Three: " + sum(a,b,c));
        sc.close();
    }
}
