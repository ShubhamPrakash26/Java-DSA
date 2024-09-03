import java.util.Scanner;

public class primeAdvanced {

    public static boolean isPrime(int num){
        boolean prime = true;
        if(num==2){
            return prime;
        }
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
}
