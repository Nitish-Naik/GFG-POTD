/*
 * 
 * Coverage of all Zeros in a Binary Matrix
Difficulty: EasyAccuracy: 55.68%Submissions: 18K+Points: 2
Given a binary matrix contains 0s and 1s only, we need to find the sum of coverage of all zeros of the matrix where coverage for a particular 0 is defined as a total number of ones around a zero in left, right, up and bottom directions.

Examples:

Input:
matrix = [[0, 1, 0],
          [0, 1, 1],
          [0, 0, 0]]
Output: 6
Explanation: There are a total of 6 coverage are there

Input: 
matrix = [[0, 1]]
Output: 1
Explanation: There are only 1 coverage.
Expected Time Complexity: O(n * m)
Expected Space Complexity: O(1)
 */


public class Coverage_of_all_Zeros_in_a_BinaryMatrix {
    public static int FindCoverage(int[][] matrix) {
        int cnt = 0;
        int m = matrix.length, n = matrix[0].length;
        
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 0) {
                    if (j < n - 1 && matrix[i][j + 1] == 1) cnt++; // Right
                    if (j > 0 && matrix[i][j - 1] == 1) cnt++; // Left
                    if (i < m - 1 && matrix[i + 1][j] == 1) cnt++; // Down
                    if (i > 0 && matrix[i - 1][j] == 1) cnt++; // Up
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int matrix[][] = {{0, 1, 0},
                    {0, 1, 1},
                    {0, 0, 0}};
        System.out.println(FindCoverage(matrix));
    }
}