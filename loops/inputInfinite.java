import java.util.Scanner;

public class inputInfinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if(num%10==0){
                System.out.println(num);
                break;
            }
            System.out.println(num);
        } while(true);
        sc.close();
    }
}
//My Approach
// int num = 0;
//         boolean flag=true;
//         while(flag){
//             num = sc.nextInt();
//             int rem = num%10;
//             if(rem==0){
//                 break;
//             }
//         }
