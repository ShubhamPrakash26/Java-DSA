import java.util.Scanner;
public class incomeTax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income:");
        float income = sc.nextFloat();
        float tax=0;
        if(income<500000){
            tax = 0;
        } else if(income>500000 && income <1000000){
            tax = 0.2f * income;
        } else {
            tax = 0.3f * income;
        }
        System.out.println("Net Payable Tax = " + tax);
        sc.close();
    }
}
