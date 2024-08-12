import java.util.*;

public class MaxValue {
    public static int maxVal(List<Integer> arr) {
        // code here
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i) - i;
            if (val > maxValue) {
                maxValue = val;
            }
            if (val < minValue) {
                minValue = val;
            }
        }

        return maxValue - minValue;
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 4);
        System.out.println(maxVal(list));
    }
}
/*
 * 
 * In a given array arr[], find the maximum value of (arr[i] – i) - (arr[j] – j) where i is not equal to j and n is the size of the array. i and j vary from 0 to n-1  arr[].

Example 1:

Input: arr[] = [9, 15, 4, 12, 13]
Output: 12
Explanation: (a[1]-1) - (a[2]-2) = (15-1)-(4-2) = 12
Input: arr[] = [3, 1, 2, 4]
Output: 3
Explanation: (a[1]-1) - (a[2]-2) = (3-1)-(1-2) = 3
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)
 */