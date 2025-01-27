class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
            if(count==0){
                count=1;
                a=nums[i];
            }
            else if(a==nums[i]){
                count=count+1;
            }
            else{
                count--;
            }
        }
        return a;
    }
}