import java.util.Scanner;
public class oddEvenSum {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddSum = 0;
        int evenSum = 0;
        while(true){
            System.out.print("Enter your Number(0 to Exit):");
            int num = sc.nextInt();
            if(num%2==0 && num!=0){
                evenSum+=num;
            } else if(num%2!=0 && num!=0){
                oddSum+=num;
            } else{
                break;
            }
        }
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
        sc.close();
    }
}
