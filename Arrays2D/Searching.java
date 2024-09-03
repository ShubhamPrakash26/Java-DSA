import java.util.Scanner;

public class Searching {

    public static void inputArray(int arr[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    public static void searchArray(int arr[][], int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("Element " + key + " found at index" + "(" + i +"," + j + ")"); 
                }
            }
        }
    }
    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        inputArray(arr);
        printArray(arr);
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();
        System.out.println("You entered: " + key);
        searchArray(arr, key);
        sc.close();
    }
}
