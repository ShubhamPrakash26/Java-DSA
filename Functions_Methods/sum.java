import java.util.Scanner;
public class sum{

    public static int findSum(int a,  int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + findSum(a,b));
        sc.close();
    }
}