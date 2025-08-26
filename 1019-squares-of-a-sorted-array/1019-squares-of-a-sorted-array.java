class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1;
        int[] n=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                n[i]=nums[l]*nums[l];
                l++;
            }
            else{
                n[i]=nums[r]*nums[r];
                r--;
            }
        }
        return n;
    }
}