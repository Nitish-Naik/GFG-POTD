import java.util.*;
public class SumMedianArray {
    public static int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        
        int a[] = new int[arr1.length + arr2.length];
        
        System.arraycopy(arr1, 0, a, 0, arr1.length);
        System.arraycopy(arr2, 0, a, arr1.length, arr2.length);
        Arrays.sort(a);
        String ab = Arrays.toString(a);
        System.out.println(ab);
        return a[a.length / 2] + a[(a.length/2) -1];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};

        System.out.println(SumofMiddleElements(arr1, arr2));
    }
}