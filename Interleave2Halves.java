import java.util.*;

public class Interleave2Halves 
{
    public static void main(String[] args) 
    {
        Queue<Integer> q = new LinkedList<>();  
        q.add(1);  
        q.add(2);  
        q.add(3);  
        q.add(4);  
        q.add(5);  
        q.add(6);  
        q.add(7);  
        q.add(8);  
        q.add(9);  
        q.add(10);  
        int mid = q.size()/2;
        System.out.println("original array : " + q);
        Queue<Integer> firstHalf = new LinkedList<>();
        for(int i=0; i<mid; i++)
        {
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()) 
        {
            q.add(firstHalf.remove());
            q.add(q.remove());

        }
        System.out.println("interleaved array " + q);
    }
}
