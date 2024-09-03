public class kadanesAlgorithm {

    public static void kadanes(int arr[]){
        int currSum=0;      
        int maxSum= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];            //Modifying currentSum by adding each element in the array every time
            if(currSum<0){
                currSum = 0;            //If current Sum is negative re initialising the current sum to 0 as it can not contribute to maxSum
            }
            maxSum = Math.max(maxSum, currSum);     //Checking maximum of currSum and maxSum and updating maxSum
        }
        System.out.println("MaxSum: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        kadanes(arr);
    }
}
