import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class NextGreaterElement {

    public static ArrayList<Integer> nextLargestElement(int a[]) {
        ArrayList<Integer> r = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for(int i=a.length-1; i>=0; i--) {
            while (!s.isEmpty() && s.peek() <= a[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                r.add(-1);
            } else {
                r.add(s.peek());
            }
            s.push(a[i]);
        }
            Collections.reverse(r);
            return r;
        }
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("output.txt");

        try (
            Scanner ip = new Scanner(new File("input.txt"));
            PrintWriter op = new PrintWriter(f);
        ) {
            int testCases = ip.nextInt();
            for (int t = 1; t <= testCases; t++) {
                int n = ip.nextInt();
                int a[] = new int[n];
                
                for (int i = 0; i < n; i++) {
                    a[i] = ip.nextInt();
                }
                op.println("Test Case " + t + ":");
                op.println("Input: " + Arrays.toString(a));
                ArrayList<Integer> r = nextLargestElement(a);
                op.println("Output : " + r);
                op.println();
                System.out.println("The result of " + t + " has been written to output.txt");
            }

        }

    }
}
