public class basics{
    public static void main(String args[]){
        int array[] = new int[50];
        int number[] = {1,2,3};
        String arr[] = {"apple", "mango", "orange"};

        for(int i=0;i<number.length;i++){
            System.out.print(number[i] + " ");
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}