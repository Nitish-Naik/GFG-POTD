public class JosephusProblem {

    public static int josephus(int n, int k)
    {
        if(n == 1) {
            return 1;
        }
        return (josephus(n-1,k) + k-1) % n+1;
    }
    public static void main(String[] args) {
        System.out.println(josephus(5+2, 3));
        System.out.println((Math.sqrt(8)));
    }
}
