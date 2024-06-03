
public class Trail_of_ones {
    static final int MOD = 1000000007;

    public static int numberOfConsecutiveOnes(int n) {
        if (n == 0) return 0;
        
        long[] dp0 = new long[n + 1];
        long[] dp1 = new long[n + 1];
        
        dp0[1] = 1; // Only "0"
        dp1[1] = 1; // Only "1"
        
        for (int i = 2; i <= n; i++) {
            dp0[i] = (dp0[i - 1] + dp1[i - 1]) % MOD;
            dp1[i] = dp0[i - 1] % MOD;
        }
        
        long totalWithoutConsecutiveOnes = (dp0[n] + dp1[n]) % MOD;
        long totalBinaryStrings = powerOfTwo(n, MOD);
        
        long result = (totalBinaryStrings - totalWithoutConsecutiveOnes + MOD) % MOD;
        return (int) result;
    }
    
    private static long powerOfTwo(int n, int mod) {
        long result = 1;
        long base = 2;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            n >>= 1;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println(numberOfConsecutiveOnes(n)); // Example output
    }
}
