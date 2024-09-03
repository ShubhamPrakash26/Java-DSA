import java.util.Scanner;
// Code for Ternary Operator
public class ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //Syntax =>     variable =  condition? statement1 : statement2
        
        int larger = num>3? num: 3;

        String type = num%2==0? "Even": "Odd";
       
        System.out.println(larger); 
        System.out.println(type); 
        sc.close();
    }
}
