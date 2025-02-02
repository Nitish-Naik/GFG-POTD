import java.util.Arrays;

class LeftRotate {
    static void rotateArr(int a[], int d) {
        d = d % a.length;
        if (d == 0) return;
        
        reverse(a, 0, d - 1);
        reverse(a, d, a.length - 1);
        reverse(a, 0, a.length - 1);
    }
    
    public static void reverse(int a[], int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int d = 2;

        rotateArr(a, d);
        Arrays.stream(a).forEach(System.out::print);
    }
}
