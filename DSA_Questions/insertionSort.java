public class insertionSort {
    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            //Finding correct index to insert the unsorted element
            while(prev>=0 && curr<arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //inserting correct Element at the correct index
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        InsertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
