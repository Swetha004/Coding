class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int e=0;
        int o=nums.length-1;
        while(e<=o)
        {
           if(nums[e]%2!=0){
            int temp=nums[e];
            nums[e]=nums[o];
            nums[o]=temp;
            o--;
           }
           else{
            e++;
           }
        }
        return nums;
    }
}