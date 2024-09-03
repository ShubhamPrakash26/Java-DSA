public class swap {

    public static void swap_numbers(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.print("A: "+ a + " B: " + b);
    }
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println("Before Swap: ");
        System.out.println("A: "+ a + " B: " + b);
        System.out.println("After Swap: ");
        swap_numbers(a, b);
    }
}
