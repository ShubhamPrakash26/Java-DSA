import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0;                                  //Initialising start and end as first and last index of the array
        int end = arr.length-1;
        while(start<=end){                            
            int mid = (start+end)/2;                   //finding mid to compare and split the sorted array into two part and then 
            if(arr[mid]==key){                        //comparing it with the key to decide on which half the key must be.
                return mid;
            } else if (arr[mid]<key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;              //return -1 if the key is not present
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        int idx = binarySearch(arr, n);
        if(idx == -1){
            System.out.println("Element not found in the array");;
        } else {
        System.out.println("The key " + n + " was found at position " + idx);
        }
        sc.close();
    }
}
