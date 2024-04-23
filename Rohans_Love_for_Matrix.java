import java.util.*;
public class Rohans_Love_for_Matrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0)
        {
            System.out.println(n);
            return ;
        }
        int MOD = 1000000007;
        long[] dp = new long[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        System.out.println((int)dp[n]);
    }   
}