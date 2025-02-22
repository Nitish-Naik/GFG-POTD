package FEBRUARY;
import java.util.*;
public class LongestValidParenthesis {
    static int maxLength(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;
        for(int i=0; i< s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(i);
            }
            else {
                stack.pop();
                if(stack.isEmpty()) {
                    stack.push(i);
                }
                else {
                    maxLength = Math.max(maxLength, i-stack.peek());
                }
            }
        }


        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(maxLength("((()"));     
        System.out.println(maxLength(")()())"));   
        System.out.println(maxLength("())()"));    
    }
}
