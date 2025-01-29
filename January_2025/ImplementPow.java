public class ImplementPow {
    static double power(double b, int e) {
        if(e==1) return b;
        if(e==0) return 1;
        if(e==-1) return 1/b;
        
        double p=power(b,e/2);
        if(e%2==0)
            return p*p;
        else if(e>0)
            return p*p*b;
        else
            return p*p/b;
    }
     

    public static void main(String args[]) {
        System.out.println(power(2, 2));
    }
}