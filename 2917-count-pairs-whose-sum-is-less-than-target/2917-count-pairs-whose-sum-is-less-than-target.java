class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int c=0,i=0,j=nums.size()-1;
        while(i<j){
            if(nums.get(i)+nums.get(j)<target){
                c+=j-i;
                i++;
            }
            else{
                j--;
            }
        }
        return c;
    }

}