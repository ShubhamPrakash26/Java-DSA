public class powerOf2 {

    public static boolean checkPowerOf2(int n){
        return ((n)&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(checkPowerOf2(15));
    }
}
