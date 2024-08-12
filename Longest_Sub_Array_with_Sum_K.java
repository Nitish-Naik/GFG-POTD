import java.util.ArrayList;
import java.util.List;

/**
 * Longest_Sub_Array_with_Sum_K
 */
public class Longest_Sub_Array_with_Sum_K 
{
    public static int lenOfLongSubarr(int a[], int n, int k) {
        //Complete the function
        int maxLength = 0;
        for(int start = 0; start<n; start++) {
            for(int end = start; end < n; end++) {
                ArrayList<Integer> al = new ArrayList<>();
                for(int i=start; i<=end; i++) {
                    al.add(a[i]);
                    // System.out.print(a[i] + " ");
                }
                // System.out.println(al);
                if(sum(al) == k) {
                    maxLength = Math.max(maxLength, al.size());
                    
                }
            }
        }
        
        return maxLength;
        // System.out.println(maxLength);
    }

    public static int sum(List<Integer> a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3};
        int n = arr.length;
        lenOfLongSubarr(arr, n , 15);
    }
}