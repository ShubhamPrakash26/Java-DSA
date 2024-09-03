public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){              //Counts no. of turns
            for(int j=0;j<arr.length-1-i;j++){     //inner loop: from 0 to n-1-turns(i)
                if(arr[j]>arr[j+1]){              //If curr>curr+1:
                    //Swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2,-2,4,2,8,4,3,10};
        bubbleSort(arr);
        printArray(arr);
    }
}
