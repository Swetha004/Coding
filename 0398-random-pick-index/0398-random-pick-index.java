class Solution {
    private int[] nums;
    private Random random;
    public Solution(int[] nums) {
        this.nums=nums;
        this.random=new Random();
    }   
    public int pick(int target) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                a.add(i);
        }
        return a.get(random.nextInt(a.size()));
    }
}