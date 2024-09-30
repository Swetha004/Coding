class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] in=new boolean[nums.length+1]; 
        for(int i:nums){
            if(!in[i]) in[i]=true;
            else return i;
        }
        return -1;
    }
}