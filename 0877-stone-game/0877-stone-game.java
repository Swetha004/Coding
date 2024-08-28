class Solution {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int a=0,b=0;
        for(int i=piles.length-1;i>=0;i-=2){
            a=a+piles[i];
            b=b+piles[i-1];
            
        if(a>b)
            return true;
        }
        return false;
    }
}