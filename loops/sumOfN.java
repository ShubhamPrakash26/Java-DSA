import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        if(num>0){
            while(num>0){
            sum+= num;
            num--;
            } 
        } else {
            while(num<0){
                sum+=num;
                num++;
            }
        }
        System.out.println("Sum of first " + num + " numbers is: " + sum);
        sc.close();
    }
}
