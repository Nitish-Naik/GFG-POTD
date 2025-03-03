import java.util.*;
import java.io.*;;
public class LongestBoundedDifferenceSubarray {
    public static ArrayList<Integer> longestSubarray(int[] a, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int start = 0;
        int end = 0;
        int maxLength = 0;
        while (end <a.length) {
            temp.add(a[end]);
            int min = Collections.min(temp);
            int max = Collections.max(temp);
            while (max - min > x) {
                temp.remove(Integer.valueOf(a[start]));
                start++;

                if (!temp.isEmpty()) {
                    min = Collections.min(temp);
                    max = Collections.max(temp);
                }
            }

            if(end - start + 1 > maxLength) {
                maxLength = end-start+1;
                ans = new ArrayList<>(temp);
            }
            end++;
        } 
        System.out.println(maxLength);
        return ans;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("output.txt");

        try (Scanner ip = new Scanner(new File("input.txt"));
            PrintWriter op = new PrintWriter(f);
        )
        {
            int testCases = ip.nextInt();
            for (int t = 1; t <= testCases; t++) {
                int length = ip.nextInt();
                int a[] = new int[length];
                for (int i = 0; i < a.length; i++) {
                    a[i] = ip.nextInt();
                }
                int x = ip.nextInt();
                op.println("output for testcase " + t + " : " + longestSubarray(a, x));
            }
        }
    }
}
