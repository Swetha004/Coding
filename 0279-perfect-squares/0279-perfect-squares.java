class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        // Arrays.fill(dp,-1);
        // return dfs(n,dp);

        //bottom up
        // for(int i=1;i<=n;i++) {
        //     dp[i] = i;
        //     for(int j = 1; j*j<=i;j++) {
        //         dp[i] = Math.min(dp[i], 1+dp[i-j*j]);
        //     }
        // }

        // return dp[n];

        //Math trick!!
        //Any number can be represented by 4 perfect squares
        //but since the question asks for minimum let us try is 1, 2, 3 are possible or else return 4

        //1 is possible when a number is a perfect square
        int sqrt = (int)Math.sqrt(n);
        if(sqrt*sqrt==n) return 1;

        // 2 is possible if a^2+b^2=n T:O(root(n))
        for(int i=1;i*i<=n;i++) {
            int bal = n - i*i;
            int numsqrt = (int)Math.sqrt(bal);
            //check if bal is also a perfect square
            if(numsqrt*numsqrt==bal) return 2;
        }

        // now for 3: a number can be expressed a sum of three 
        //perfect squares only it the number is not of the form
        //n!=4^k(8m+7). So instead of checking for non equality
        //if n is of this form, it would imply it is sum of 4 perfect squares minimum.
        //else let us return a 3
        while(n%4==0) n = n/4;
        if((n-7)%8 == 0) return 4;

        else return 3;
    }

    public int dfs(int n, int[] dp) {
        if(n<=0) return 0;
        if(dp[n]!=-1) return dp[n];

        int ans = n;
        for(int i=1;i*i<=n;i++) {
            ans=Math.min(ans,1+dfs(n-i*i, dp));
        }

        return dp[n]= ans;
    }
}