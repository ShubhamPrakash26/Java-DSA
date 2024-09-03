import java.util.Scanner;

public class binomialCoefficient {

    public static int fact(int num){
        int result = 1;
        while(num>1){
            result*=num;
            num--;
        }
        return result;
    }

    public static int binCoeff(int n, int r){
        int result = fact(n)/(fact(r)*fact(n-r));
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = binCoeff(n,r);
        System.out.println("Binomail Coefficient: " + result);
        sc.close();
    }
}
