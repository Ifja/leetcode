class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        
        for(int l=2;l<=n;l++){
            for(int i=0;i+l<=n;i++){
                int j=i+l-1;
                if(l==2) dp[i][j]=(s.charAt(i)==s.charAt(j));
                else dp[i][j]= (s.charAt(i)==s.charAt(j)) && dp[i+1][j-1];
            }
        }
        
        int ans=0;
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
                if(dp[i][j]) ans++;
        } 
        }
        return ans;
    }
}