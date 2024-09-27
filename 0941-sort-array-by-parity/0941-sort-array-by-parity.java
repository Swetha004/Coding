class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int e=0;
        int o=nums.length-1;
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]%2==0){
            a[e]=nums[i];
            e++;
           }
           else{
            a[o]=nums[i];
            o--;
           }
        }
        return a;
    }
}