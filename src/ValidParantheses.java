import java.util.Stack;

public class ValidParantheses {
    public static boolean isValid(String s) {
        Stack<Character> paranthesisStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(') paranthesisStack.push(')');
            else if (c=='[') {
                paranthesisStack.push(']');
            } else if (c=='{') {
                paranthesisStack.push('{');
            }
            else{
                if(paranthesisStack.isEmpty()||paranthesisStack.pop()!=c){
                    return false;
                }
            }
        }
        return paranthesisStack.isEmpty();
    }
}
