public class SumOfElementsArray {
    public static int sum(int a[], int i) {
        if(i == a.length) {
            return 0;
        }
        return a[i] + sum(a, i+1);
    }
    public static void main(String[] args) {
        int a[] = {};
        System.out.println(sum(a, 0));
    }
}
