import java.util.*;
public class FirstNonRepeatingCharacters 
{

    public static void printNonRepeating(String s)
    {
        int freq[] = new int[26]; // 'a'-'z'
        Queue<Character> q = new LinkedList<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) 
            {
                q.remove();
            }
            if(q.isEmpty())
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(q.peek());
            }
        }
        // System.out.println();
    }

    public static void main(String[] args) {
        String s = "aabccxb";
        printNonRepeating(s);
    }

    
}
