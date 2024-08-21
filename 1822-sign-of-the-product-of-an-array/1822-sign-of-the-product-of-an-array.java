class Solution {
    public int arraySign(int[] nums) {
        int m=1,n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                return 0;
            }
            if(nums[i]<0)
            {
               n=n+1;
            }
        }
        if(n%2==0)
        {
            return 1;
        }
        else
        {
            return -1;
        }

    }
}