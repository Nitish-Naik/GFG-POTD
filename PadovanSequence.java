

public class PadovanSequence {
    public static int padovanSequence(int n)
    {
        //code here.

        if(n <= 2 ) {
            return 1;
        }

        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;

        for(int i=3; i<=n; i++) {
            dp[i] = dp[i-2] + dp[i-3];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(padovanSequence(4));
    }
}


/* 
 * 
 * Given a number n, find the nth number in the Padovan Sequence.

A Padovan Sequence is a sequence which is represented by the following recurrence relation
P(n) = P(n-2) + P(n-3)
P(0) = P(1) = P(2) = 1

Note: Since the output may be too large, compute the answer modulo 10^9+7.
*/
