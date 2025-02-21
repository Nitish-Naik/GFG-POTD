
package FEBRUARY;

import java.util.Map;
import java.util.Stack;

public class ParenthesisChecker {

    // Method - 1

    /* 
    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char a = s.charAt(i);

            if(a == '(' || a == '[' || a== '{') {
                stack.push(a);
                continue;
            }
            if(stack.isEmpty()) {
                return false;
            }

            char check;
            switch (a) {
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '(' || check == '{') {
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '[' || check == '(') {
                        return false;
                    }
                break;
            }
        }
        return stack.isEmpty();
    }
    */

    // Method -2   == Using Hashmap

    static boolean isBalancedHashMap(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pairs = Map.of(')', '(', ']', '[', '}', '{');
        System.out.println("pairs : " + pairs);
        return false;
    }



    public static void main(String[] args) {
        String s = "[{()}]";
        // for (int i = 0; i < s.length; i++) {
        //     System.out.println(isBalanced(s[i]));
        // }

        System.out.println("Mapping : " + isBalancedHashMap(s));
    }
    
}