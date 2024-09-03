public class BitOperations{
    public static void main(String args[]){
        System.out.println(5&6);        //& operator is used so 5 and 6 is converted into bits and then the value is calculated
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~5); //-6
        System.out.println(~0); //-1
        System.out.println(5<<2); //20
        System.out.println(6>>1); //3
    }
}