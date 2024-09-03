public class PairsArray{

    public static void printPairs(int arr[]){
        int tp=0;                                                    //For counting total Pairs
        for(int i=0;i<arr.length;i++){                              //Iterating throught the loop where i is the element to make pair with
            for(int j=i+1;j<arr.length;j++){                       //Iterating through i+1th element in the loop to make pairs
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;
            }
            System.out.println(); 
        }
        System.out.print("Total Pairs = " + tp);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printPairs(arr);
    }
}