import java.util.Scanner;

public class primeInRange {

    //Function to Check if the given number is prime
    public static boolean isprime(int num){
        boolean isPrime = true;
        if(num==2){
            return isPrime;
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }

    //Function to print prime Numbers in the Given range n
    public static void printPrimes(int n){
        for(int i=2; i<n;i++){
            if(isprime(i)){                    //Calling isPrime() to check if the current iteration i is prime or not till (i<n)
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        printPrimes(n);
        sc.close();
    }
}
