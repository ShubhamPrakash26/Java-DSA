import java.util.Scanner;

public class primebasic {   
    public static boolean isPrime(int n){
        for(int i=2; i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        boolean prime = isPrime(n);
        System.out.println(prime);
        sc.close();
    }
}
