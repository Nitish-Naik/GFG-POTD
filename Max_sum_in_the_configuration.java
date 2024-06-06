class Max_sum_in_the_configuration {
    static long max_sum(int a[], int n) {
        long arraySum = 0; // sum of all elements in the array
        long currentSum = 0; // sum of i*a[i]
        
        
        // Calculating the sum of all elements and currentSum
        for (int i = 0; i < n; i++) {
            arraySum += a[i];
            currentSum += (long)i * a[i];
        }
        
        long maxSum = currentSum; // maximum sum found so far
        
        // Iterating through rotations of the array
        for (int i = 1; i < n; i++) {
            currentSum = currentSum + arraySum - (long)n * a[n - i]; // Update currentSum for next rotation
            maxSum = Math.max(maxSum, currentSum); // Update maxSum if needed
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int n = 4;
        int a[] = {8, 3, 1, 2};
        System.out.println(max_sum(a, n));
    }
}

/*
 * Example 1:

Input: n = 4, a[] = {8, 3, 1, 2}
Output: 29
Explanation: All the configurations possible by rotating the elements are:
3 1 2 8 here sum is 3*0+1*1+2*2+8*3 = 29
1 2 8 3 here sum is 1*0+2*1+8*2+3*3 = 27
2 8 3 1 here sum is 2*0+8*1+3*2+1*3 = 17
8 3 1 2 here sum is 8*0+3*1+1*2+2*3 = 11, so the maximum sum will be 29.
Example 2:

Input: n = 3, a[] = {1, 2, 3}
Output: 8
Explanation: All the configurations possible by rotating the elements are:
1 2 3 here sum is 1*0+2*1+3*2 = 8
3 1 2 here sum is 3*0+1*1+2*2 = 5
2 3 1 here sum is 2*0+3*1+1*2 = 5, so the maximum sum will be 8.
 */