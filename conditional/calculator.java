import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        double result = 1;
        System.out.print("Enter Operation: ");
        int operator = sc.next().charAt(0);
        switch(operator){
            case '+':
                    result = a+b;
                    break;
            case '-':
                    result = a-b;
                    break;
            case '*':
                    result = a*b;
                    break;
            case '/':
                    if(b==0){
                        System.out.println("Division by 0 not possible");
                    } else{
                        result = a/b;
                    }
                    break;
            case '^':
                    for(int i=1;i<=b;i++){
                        result *= a;
                    }
                    break;
            case '%':
                    result = a%2;
                    break;
            default:
                    System.out.println("Operator not found...Try Again!");
        }
        System.out.println("Result: "+ result);
        sc.close();
    }
}
