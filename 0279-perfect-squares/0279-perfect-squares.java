class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        int sqrt = (int)Math.sqrt(n);
        if(sqrt*sqrt==n) return 1;
        for(int i=1;i*i<=n;i++) {
            int bal = n - i*i;
            int numsqrt = (int)Math.sqrt(bal);
            if(numsqrt*numsqrt==bal) return 2;
        }
        while(n%4==0) n = n/4;
        if((n-7)%8 == 0) return 4;
        else return 3;
    }
}