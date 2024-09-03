import java.util.Scanner;

public class square_area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("Area of the square of side" + side + "is: " + area);
        sc.close();
    }
}
