/*
 * 
 * Given an array arr of distinct elements of size n, the task is to rearrange the elements of the array in a zig-zag fashion so that the converted array should be in the below form: 

arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]. 

Note: Modify the given arr[] only, If your transformation is correct, the output will be 1 else the output will be 0. 

Examples

Input: n = 7, arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: 3 7 4 8 2 6 1
Explanation: 3 < 7 > 4 < 8 > 2 < 6 > 1
Input: n = 4, arr[] = {1, 4, 3, 2}
Output: 1 4 2 3
Explanation: 1 < 4 > 2 < 3
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 106
0 <= arri <= 109
 */





public class ConvertArrayToZigZag {
    public static int[] zigZag(int n, int[] arr) {
        boolean flag = true;
        for(int i=0; i<n-1; i++) {
            if(flag) {
                if(arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
            else {
                if(arr[i] < arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
            flag = !flag;
        }

        return arr;
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[i+1];
        a[i+1] = temp;
    }
    public static void main(String[] args) {
        int a[] = {4, 3, 7, 8, 6, 2, 1};

        int ans[] = zigZag(a.length, a);
        for(int i: ans) {
            System.out.print(i + " ");
        }
    }
}
