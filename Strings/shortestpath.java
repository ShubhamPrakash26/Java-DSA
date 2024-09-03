public class shortestpath {

    public static double getShortestpath(String path){
        double dist = 0;
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            } else if(path.charAt(i)=='S'){
                y--;
            } else if(path.charAt(i)=='W'){
                x--;
            } else {
                x++;
            }
        }
        dist = Math.sqrt(x*x + y*y);
        return dist;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestpath(path));
    }
}
