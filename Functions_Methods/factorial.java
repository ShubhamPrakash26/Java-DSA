import java.util.Scanner;

public class factorial {
    public static int fact(int num){
        int result = 1;
        for(int i=1;i<=num;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println("Factorial: " + result);
        sc.close();
    }
}
