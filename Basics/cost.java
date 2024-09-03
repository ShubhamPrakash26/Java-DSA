import java.util.Scanner;

public class cost {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();        
        float pencil = sc.nextFloat();        
        float erasor = sc.nextFloat();        
        float price =  (pen + pencil + erasor) + (0.18f*(pen+pencil+erasor));
        System.out.println("Total Cost: " + price);
        sc.close();
    }
}
