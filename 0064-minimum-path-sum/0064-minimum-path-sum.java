class Solution {
    
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n= grid[0].length;
        int dp[][]= new int[m][n];
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) {
                    dp[0][0]=grid[0][0];
                }else{
                    int down=grid[i][j],right=grid[i][j];
                    if(i>0) down+=dp[i-1][j];
                    else down+=(int) Math.pow(10,9);
                    if(j>0) right+=dp[i][j-1];
                    else right+=(int)Math.pow(10,9);
                    dp[i][j]=Math.min(down,right);
                }
            }
        }
        return dp[m-1][n-1];
    }
}