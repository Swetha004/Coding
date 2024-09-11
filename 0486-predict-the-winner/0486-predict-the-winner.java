class Solution {
    public boolean predictTheWinner(int[] nums) {
        if(solve(nums,0,nums.length-1)>=0){
            return true;
        }
        else{
            return false;
        }
    }
    public int solve(int nums[],int l,int r){
        if(l==r){
            return nums[l];
        }
        int pl=nums[l]-solve(nums,l+1,r);
        int pr=nums[r]-solve(nums,l,r-1);
        return Math.max(pl,pr);
    }
}