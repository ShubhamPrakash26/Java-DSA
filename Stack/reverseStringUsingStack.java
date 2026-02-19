import java.util.Stack;
public class reverseStringUsingStack {

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            res.append(curr);
        }
        str = res.toString();
        return str;
    }

    public static void main(String[] args) {
        String str= "abcd";
        String result = reverseString(str);
        System.out.println(result);
    }
}
