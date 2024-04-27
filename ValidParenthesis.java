import java.util.*;
public class ValidParenthesis 
{
    public static void main(String[] args) 
    {
        String s = "[()]{}{[)()]()}";
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char x = s.charAt(i);
            if(x == '(' || x == '{' || x == '[')
            {
                stack.push(x);
                continue;
            }

            if(stack.isEmpty())
            {
                System.out.println("stack is empty");
                return;
            }
            char check;
            switch (x) 
            {
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[')
                    {
                        System.out.println("not balance");
                        return;
                    }
                    break;
                    case '}':
                    check = stack.pop();
                    if(check == '(' || check == '[')
                    {
                        System.out.println("not balance");
                        return;
                    }
                    break;
                    case ']':
                    check = stack.pop();
                    if(check == '{' || check == '(')
                    {
                        System.out.println("not balance");
                        return;
                    }
                    break;
            }

        }
        if(stack.isEmpty())
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    
}