import java.util.*;

public class SwappingPairsMakeSumEqual {

    public static long findSwapValues(long[] a, long[] b) {
        // Calculate sums of both arrays
        long sumA = 0, sumB = 0;
        for (long num : a) {
            sumA += num;
        }
        for (long num : b) {
            sumB += num;
        }

        // Calculate the difference of sums
        long delta = sumA - sumB;

        // If delta is odd, it's impossible to balance the arrays by swapping any pair of integers
        if (delta % 2 != 0) {
            return -1;
        }

        // We need to find x in a and y in b such that y = x + delta / 2
        long target = delta / 2;
        Set<Long> setB = new HashSet<>();
        for (long num : b) {
            setB.add(num);
        }

        for (long x : a) {
            if (setB.contains(x - target)) {
                return 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        long[] a1 = {4, 1, 2, 1, 1, 2};
        long[] b1 = {3, 6, 3, 3};
        System.out.println(findSwapValues(a1, b1));  // Output: 1

        long[] a2 = {5, 7, 4, 6};
        long[] b2 = {1, 2, 3, 8};
        System.out.println(findSwapValues(a2, b2));  // Output: 1
    }
}
