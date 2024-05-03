import java.util.*;

public class QueueReversal 
{
    public static void main(String[] args) 
    {
        Queue<Integer> q = new LinkedList<>(); 
        q.add(4);   
        q.add(3);   
        q.add(1);   
        q.add(10);   
        q.add(2);   
        q.add(6);   
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()) 
        {
            s.push(q.remove());    
        }

        while(!s.isEmpty()) 
        {
            q.add(s.pop());    
        }
        System.out.println(q);
    }    
}
