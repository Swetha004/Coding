class Solution {
    public boolean isMonotonic(int[] nums) {
        int d=0,in=0;
        for(int i=0;i<(nums.length)-1;i++)
        {
            if(nums[i]>=nums[i+1])
                d++;
            if(nums[i]<=nums[i+1])
                in++;
        }
        if(d==nums.length-1 || in==nums.length-1)
            return true;
        return false;
    }
}