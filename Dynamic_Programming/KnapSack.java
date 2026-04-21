package Dynamic_Programming;
import java.util.*;
public class KnapSack {
    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int C = 7, n = 4;
        int[][] dp = new int[5][8];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i] , -1);
        }
        System.out.println(knap(wt, val, C, n));
        
    }
    
   
    // Recursion + memoization
    public static int knapsack(int[][] dp ,int[] wt , int[] val , int C , int n){
        if(n == 0 || C == 0) return 0;
        if(dp[n][C] != -1) return dp[n][C];
        if(wt[n-1] <= C){
            int a = val[n-1] + knapsack(dp , wt, val , C-wt[n-1] , n-1);
            int b = knapsack(dp , wt , val , C , n-1);
            return dp[n][C] = (int)Math.max(a, b);
        }
        return dp[n][C] =knapsack(dp , wt , val , C , n-1);
    }
    
    // top-down DP
    public static int knap(int[] wt , int[] val , int W , int n){
        int[][] dp =  new int[n+1][W+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= W; j++){
                if(wt[i-1] <= j){
                    dp[i][j] = (int)Math.max(val[i-1] + dp[i-1][j - wt[i-1]] , dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
}
