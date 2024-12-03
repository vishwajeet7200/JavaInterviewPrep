import java.util.Stack;

public class Leetcode {
    static boolean isValid(String s) {
        Stack<Character> c = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '['){
                c.push(ch);
            }else{
                if(c.isEmpty()){
                    return false;
                }
                char topChar = c.pop();
                if((topChar == '(' && ch != ')') || (topChar == '{' && ch != '}') || (topChar == '[' && ch != ']')){
                    return false;
                }
            }
        }
        return c.isEmpty();  
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
