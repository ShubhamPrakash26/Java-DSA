public class PrintSubarrays {

    public static void printSubarrays(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            // i -> To find all the subarrays from i
            for(int j=i;j<arr.length;j++){
                // j-> Till which element first subarray is to be printed
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");     //Printing SubArrays
                }
                ts++;       //Incrementing Total Number of subarrays
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: " + ts);       //printing Total Subarrays
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubarrays(arr);
    }
}
