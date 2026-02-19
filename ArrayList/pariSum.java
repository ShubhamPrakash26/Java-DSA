class Main {
    public static boolean findPair(int arr[], int target){
        int pIdx = -1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                pIdx = i;
                break;
            }
        }
        int l = pIdx+1, r = pIdx;
        while(l!=r){
            int currSum = arr[l]+arr[r];
            if(currSum==target){
                return true;
            } else if(currSum<target){
                l = (l+1)%n;
            } else{
                r = (n+r-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {11,15,6,7,8,9,10};
        System.out.println(findPair(arr, 29));
    }
}