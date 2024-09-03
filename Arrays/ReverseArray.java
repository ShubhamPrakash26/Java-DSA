public class ReverseArray {
    
    public static void reverseArray(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while(first<=last){                         //Checking if first < last as a condition to check if the array is reversed.
            int temp = arr[last];                  //Storing element at last position i array to temp
            arr[last] = arr[first];               //assigning last element of the array the value of first element
            arr[first] = temp;                   //assigning first element of the array the value of last element stored in temp
            first++;                            //Incrementing First
            last--;                            //Decrementing Last
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
