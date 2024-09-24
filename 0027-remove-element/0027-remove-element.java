class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,c=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[c]=nums[i];
                c++;
            }
            i++;
        }
        return c;
    }
}