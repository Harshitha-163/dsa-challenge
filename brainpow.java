import java.util.HashMap;
class Solution {
    int [] [] q;
    int n;
    Long[] dp;
    public long mostPoints(int[][] questions) {
        this.q=questions;
        this.n=questions.length;
        dp=new Long[n];
        return sol(0);
        
    }
    private long sol(int idx){
        if(idx>=n){
            return 0;
        }
        
        if(dp[idx]!=null){
            return dp[idx];
        }
        int points=q[idx][0];
        int brainpower=q[idx][1];
        long a=points+sol(idx+1+brainpower);
        long b=sol(idx+1);
        return dp[idx]= Math.max(a,b);

    }
}
