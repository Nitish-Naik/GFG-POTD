import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountwaysNthStair {
    public static int nthStair(int n) {
        // Code here
        if (n == 0) return 1;
        if (n == 1) return 1;
        int prev2 = 1;
        int prev1 = 1;
        int current = 1;
        
        for (int i = 2; i <= n; i++) {
            current = prev2 + 1;
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }

    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner sc = new Scanner(new File("/workspaces/GFG-POTD/SEPTEMBER_2024/input.txt"));
            PrintWriter p = new PrintWriter(new File("/workspaces/GFG-POTD/SEPTEMBER_2024/output.txt"));

            int n = sc.nextInt();

            // Change this line
            p.print(nthStair(n)); // Or use p.println(nthStair(n));

            p.flush();
            p.close();
            sc.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
