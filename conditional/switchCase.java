import java.util.*;
public class switchCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1: System.out.println("Samosa");break;
            case 2: System.out.println("Sandwich"); break;
            case 3: System.out.println("Swarma"); break;
            case 4: System.out.println("MilkShake"); break;
            default: System.out.println("Try Again....."); break;
        }
        sc.close();
    }
}
