public class Power {
    public static double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;

        double halfSquare = myPow(x, n/2);
        if(n < 0 && n % 2 != 0) return 1/(x * halfSquare * halfSquare);
        else if(n < 0 && n % 2 == 0) return 1/(halfSquare * halfSquare);
        if(n > 0 && n % 2 == 0) return halfSquare * halfSquare;
        return x * halfSquare * halfSquare;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
}
