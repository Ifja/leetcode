class Solution {
    public String longestPalindrome(String s) {
        int n=s.length(), max_len=0, starting_index=0;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
        }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
              if(isPalindrome(dp, s,i,j)){
                  if(j-i+1>max_len){
                      max_len=j-i+1;
                      starting_index=i;
                  }
              }
            }
        }
        return s.substring(starting_index,starting_index+max_len);
    }
    
    public boolean isPalindrome(int[][] dp, String s,int i,int j){
        if(dp[i][j]!=-1) return dp[i][j]==1;
        dp[i][j]=0;
        if(i==j) dp[i][j]=1;
        else if(j-i==1)   dp[i][j]=(s.charAt(i)==s.charAt(j))?1:0;
        else if(s.charAt(i)==s.charAt(j) && isPalindrome( dp, s, i+1, j-1)) 
            dp[i][j]=1;
        return dp[i][j]==1;
    }
}