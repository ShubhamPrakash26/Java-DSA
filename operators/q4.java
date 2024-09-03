public class q4 {
    public static void main(String[] args){
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        //         1  * (9+34=43) + 9*(9+24)=234   +  (3+12*(4))/(2+48) 
        //                  277                    +    (51/50)=1
        //                              278
        System.out.println(exp);
        }
}
