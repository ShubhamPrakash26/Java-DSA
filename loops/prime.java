import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num<2){
            isPrime = false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
