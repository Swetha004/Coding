class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> al=new ArrayList<>();
        int r=nums.length-1,l=0;
        while(l<r){
            if(nums[l]+nums[r]==target){
                return new int[]{l+1,r+1};
            }
            else if(nums[l]+nums[r]>target){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}