public class checkFirstOccurance {

    public static int firstOccurance(int arr[], int key, int i){
        if(i==arr.length-1 && arr[i]!=key){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1); 
    }
    public static int lastOccurance(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,4,3,8,2,44,5};
        System.out.println(lastOccurance(arr, 5, 0));
    }
}
