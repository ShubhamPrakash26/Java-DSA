class Subset{
    public static void FindSubset(String str, int i, String ans){
        if(i == str.length()){
            if(ans.length()==0){
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        FindSubset(str,i+1, ans+str.charAt(i));
        FindSubset(str,i+1, ans);
    }
    public static void main(String args[]){
        String str = "abc";
        FindSubset(str, 0, "");
    }
}