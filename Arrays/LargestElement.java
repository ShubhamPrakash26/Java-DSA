import java.util.Scanner;

public class LargestElement {

    public static int largestElement(int arr[]){
        int largest = Integer.MIN_VALUE;                //Assigning -infinity to largest
        for(int i=0; i<arr.length;i++){                
            if(arr[i]>largest){                         //If current element of the array is greater than the largest, update largest
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int smallestElement(int arr[]){
        int smallest = Integer.MAX_VALUE;                //Assigning infinity to smallest
        for(int i=0; i<arr.length;i++){
            if(arr[i]<smallest){                         //If current element of the array is gsmaller than the smallest, update smallest
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,6,3,9,7};
        int largest = largestElement(arr);
        int smallest = smallestElement(arr);
        System.out.println("Largest element in the array: " + largest);
        System.out.print("Smallest element in the array: " + smallest);
        sc.close();
    }
}
