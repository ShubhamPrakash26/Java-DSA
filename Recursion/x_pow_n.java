public class x_pow_n {

    public static int pow(int x, int n){
        if(n==0 || n==1){
            return x;
        }
        return x * pow(x, n-1);
    }

    public static int optimisedPower(int x, int n){
        if(n==0) return 1;
        int halfPower = optimisedPower(x, n/2);
        int halfPowerSquare = halfPower * halfPower;
        if(n%2!=0){
            halfPowerSquare = x* halfPowerSquare;
        }
        return halfPowerSquare;
    }
    public static void main(String[] args) {
        System.out.println(optimisedPower(5,10));
    }
}
