public class GenerateParentheses {
    public static String parenthesis(String s, int o, int c, int n) {
        if(o == c) {
            return s;
        }
        if(o > c) {
            return parenthesis(s+"}", o, c+1, n);
        }
        return parenthesis(s+"{", o+1, c, n);
    }

    public static void balPar(char[] a, int n, int i, int o, int c) {
        if(i == a.length) {
            System.out.println(a);
        }
        if(o<n) {
            a[i] = '(';
            balPar(a, n , i+1, o+1, c);
        }
        if(c < o) {
            a[i] = ')';
            balPar(a, n, i+1, o, c+1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        char a[] = new char[n*2];
        balPar(a, n, 0, 0, 0);
        
    }
}
