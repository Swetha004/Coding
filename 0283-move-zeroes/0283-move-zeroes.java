class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0;
        int left =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                temp=nums[i];
                nums[i]= nums[left];
                nums[left]=temp;
                left++;
            }
        }
    }
}