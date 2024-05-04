import java.util.*;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        int n = 5;
        Queue<String> q = new LinkedList<>();

        // Method - 1
        for(int i=1; i<=n; i++) {
            q.add(Integer.toBinaryString(i));
        }
        System.out.println(q);

        // method - 2

        q.add("1");
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }
}
