class Solution {
    public int searchInsert(int[] nums, int k) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==k){
                return mid;
            }
            else if(nums[mid]>k){
                high=mid-1;
            }
            else if(nums[mid]<k){
                low=mid+1;
            }
        }
        return low;
    }
}