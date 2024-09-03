import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leapYear = false;
        if(year%4==0 && (year%100!=0 || year%400==0)){
                leapYear = true;
        } else{
            leapYear = false;
        }
        System.out.println("Is " + year + " leap year? "+ leapYear);
        sc.close();
    }
}
