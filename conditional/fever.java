import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Body temperature:");
        float temp = sc.nextFloat();
        if(temp>100){
            System.out.println("You have fever");
        } else{
            System.out.println("Your don't have fever");
        }
        sc.close();
    }
}
