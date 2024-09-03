public class substring {

    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));   //Java's built-in substring function
        System.out.println(subString(str, 0, 5));   //Our function implementation of subString
        System.out.println(str.compareToIgnoreCase(str));   
    }
}
