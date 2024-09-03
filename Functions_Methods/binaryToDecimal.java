import java.util.Scanner;

public class binaryToDecimal {

    //Function to convert Binary number into Decimal number
    public static int binToDecimal(int num){
        int dec=0;
        int i=0;
        while (num != 0) {
            int lastDigit = num % 10;               //Finding Last Digit of the number
            int mul = (int) Math.pow(2, i);      //Finding power of 2 to be multiplied to the last Digit
            dec += mul * lastDigit;               //Multiplying Power of 2 to the Last Digit and adding it to the Decimal Number
            num /= 10;                           //Reducing the Binary Numbers Last Digit after manipulation
            i++;                                //Increasing the Power of two
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Binary Number: ");
        int bin = sc.nextInt();
        int dec = binToDecimal(bin);
        System.out.println("Decimal: " + dec);
        sc.close();
    }
}
