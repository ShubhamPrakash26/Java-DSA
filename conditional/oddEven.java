import java.util.Scanner;

public class oddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even");
        } else {
            System.out.println(num + " is odd");
        }
        sc.close();
    }
}
