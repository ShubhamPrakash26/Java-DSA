import java.util.Scanner;

public class inputExceptNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if(num%10==0 && num!=0){
                continue;
            }
            if(num==0){
                break;
            }
            System.out.println(num);
        } while(true);
        sc.close();
    }
}
