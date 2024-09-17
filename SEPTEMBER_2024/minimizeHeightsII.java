import java.util.*;
class minimizeHeightsII{
    public static int getMinDiff(int[] a, int k) {
        // code here

        int n = a.length;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        Arrays.sort(a);
        int res = a[n-1] - a[0];
        for(int i=1; i<n; i++) {
            if(a[i] > k) {
                max = Math.max(a[i-1] + k, a[n-1]-k);
                min=Math.min(a[0], a[i]-k);
                res = Math.min(res, max-min);
            }
            else continue;
        }
        return res;
    }
    public static void main(String[] args) {
        int k  =7;
        int a[] = {1, 8, 10, 6, 4, 6, 9, 1};
        //         8, 1, 3, 13, 11, 13, 2, 8
        System.out.println(getMinDiff(a, k));
    }
}

/*
 * Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
 */
