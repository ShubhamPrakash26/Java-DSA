import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        //Mathematical Approach
        
        int rev = 0;
        while(num>0){
            int lastDigit = num%10;
            rev = (rev*10) + lastDigit;
            num/=10;
        }
        System.out.println("Reversed number: " + rev);

        // while(num>0){
        //     int lastDigit = num%10;
        //     System.out.print(lastDigit);
        //     num/=10;
        // }
        sc.close();
    }
}
