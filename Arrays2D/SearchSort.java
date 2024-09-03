public class SearchSort {

    public static boolean search(int arr[][], int key){
        int row = 0, col = arr[0].length-1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == key){           //Check if element is at the current index
                System.out.println("Found key at " + row + "," + col);
                return true;
            } else if(key<arr[row][col]){       //if key<required then move up in the matrix by col--
                col--;
            } else {                            //if key>required then move to the right
                row++;
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40}, {15,25,35,45}, {27,29,37,48},{32,33,39,50}};
        int key = 33;
        search(matrix, key);
    }
}
