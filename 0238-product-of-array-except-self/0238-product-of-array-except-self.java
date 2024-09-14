class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1,post=1;
        int n=nums.length;
        int[] res=new int[nums.length];
        for(int i=0;i<n;i++)
        res[i]=1;
        for(int i=0;i<nums.length;i++){
            res[i]*=pre;
            pre=pre*nums[i];
            res[n-i-1]*=post;
            post=post*nums[n-i-1];
        }
        return res;
    }
}