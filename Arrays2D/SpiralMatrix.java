public class SpiralMatrix {

    public static void printSpiral(int arr[][]){
        int sr=0;
        int sc=0;
        int er=arr.length-1;
        int ec=arr[0].length-1;
        while(sr<=er && sc<=ec){
            //top boundary
            for(int j=sc;j<=ec;j++){
                System.out.print(arr[sr][j] + " ");
            }
            //right boundary
            for(int i=sr+1; i<=er;i++){
                System.out.print(arr[i][ec] + " ");
            }
            //bottom boundary
            if(sr==er){
                break;
            }
            for(int j=ec-1;j>=sc;j--){
                System.out.print(arr[er][j] + " ");
            }
            //left boundary
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(arr[i][sc]);
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        printSpiral(matrix);
    }
}
