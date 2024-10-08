
class LongestCommonSubString {
    public int longestCommonSubstr(String str1, String str2) {
        // code here
        int n=str1.length(),m=str2.length(),ans=0;
        int[][] dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    ans=Math.max(ans,dp[i][j]);
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        LongestCommonSubString lcs = new LongestCommonSubString();
        System.out.println(lcs.longestCommonSubstr("ABCDGH", "AEDF"));
    }
}