class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1];  // dp[i] = max points from question i onwards

        for (int i = n - 1; i >= 0; i--) {
            int points = questions[i][0];
            int brainpower = questions[i][1];

            int next = i + brainpower + 1;  // Next question you can solve if you choose current one

            long solve = points + (next < n ? dp[next] : 0);  // Take current question
            long skip = dp[i + 1];                             // Skip current question

            dp[i] = Math.max(solve, skip);                     // Choose the better option
        }

        return dp[0];
    }
}
