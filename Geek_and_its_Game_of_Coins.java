class Geek_and_its_Game_of_Coins {
    public static int findWinner(int n, int x, int y) {
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; ++i) {
            if (i >= 1 && dp[i - 1] == 0) {
                dp[i] = 1;
            } else if (i >= x && dp[i - x] == 0) {
                dp[i] = 1;
            } else if (i >= y && dp[i - y] == 0) {
                dp[i] = 1;
            } else {
                dp[i] = 0;
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(findWinner(5, 3, 4));
    }
}