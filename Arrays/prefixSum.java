public class prefixSum {
    public static void PrefixSum(int arr[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];             //initialising an array prefixSum to calculate sum of previous elements
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];       //Finding PrefixSum array
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];       //Finding Current Sum
            }
            if(maxSum<currSum){
                maxSum = currSum;
            }
        }
        System.out.println("Max Sum: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        PrefixSum(arr);
    }
}
