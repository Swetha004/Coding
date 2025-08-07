class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0;
        for(int num:nums){
            if(num!=0){
                nums[temp++]=num;
            }
        }
        while(temp<nums.length){
            nums[temp++]=0;
        }
    }
}