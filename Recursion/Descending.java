public class Descending {

    public static void printDescending(int n) {
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDescending( n -1);
    }
    public static void printAscending(int n) {
        if (n==1){
            System.out.print(n + "");
            return;
        }
        printAscending(n-1);
        System.out.print(n + " ");
        
    }
    public static void main(String[] args) {
        printDescending(10);
        System.out.println();
        printAscending(10);
    }
}
