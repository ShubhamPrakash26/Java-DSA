import java.util.Scanner;

public class decimalToBinary {

    public static int decToBinary(int num){
        int bin = 0;
        int rem = 0;
        
        int pow =0;
        while(num>0){
            rem = num%2;
            bin = bin + rem*(int)Math.pow(10, pow);
            num = num/2;
            pow++;
        }
        return bin;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Decimal Number: ");
        int dec = sc.nextInt();
        int bin = decToBinary(dec);
        System.out.println("Binary: " + bin);
        sc.close();
    }
}
