import java.util.*;
public class ReversingthefirstKelementsQueue {
    public static void main(String[] args) {
        Deque<Integer> q  = new LinkedList<>();
        q.addLast(10);
        q.addLast(20);
        q.addLast(30);
        q.addLast(40);
        q.addLast(50);
        q.addLast(60);
        q.addLast(70);
        q.addLast(80);
        q.addLast(90);
        q.addLast(100);
        Deque<Integer> s = new LinkedList<>();
        int mid = q.size()/2;

        for(int i=0; i<mid; i++)
        {
            s.addFirst((q.removeFirst()));
        }
        while(!s.isEmpty()) {
            q.addFirst(s.removeLast());
        }
        System.out.println(s);
        System.out.println(q);
    }
}
