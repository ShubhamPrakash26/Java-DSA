import java.util.Scanner;

public class linearSearch {
    //Function for searching for the element in the array
    public static int LinearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){                  //Outer Loop for iterating every element in the array
            if(arr[i] == key){                         //If current element is equal to the key then true else false
                return i;                             //returns current index as output
            }
        }
        return -1;            //returns -1 if the element is not found in the array
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the element to be searched for: ");
        int key = sc.nextInt();

        System.out.println("Enter the elements to the array: ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int index = LinearSearch(arr, key);
        if(index ==-1){
            System.out.println("Element not found in the array..");
        } else {
            System.out.print("Your element was found at index: " + index );
        }
        sc.close();
    }
}
