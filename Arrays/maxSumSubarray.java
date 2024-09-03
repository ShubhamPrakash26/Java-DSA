public class maxSumSubarray {

    public static void MaxSumSubarray(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;           //Initialising maxSum= -infinity
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;                  //Initialsing sum=0 for each iteration after 
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];            //Finding sum of the current subarray
                }
                if(currSum>maxSum){
                    maxSum = currSum;           //If sum>maxSum updating maxSum
                }
            }
        }
        System.out.println("Max Sum: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        MaxSumSubarray(arr);
    }
}
