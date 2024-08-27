class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Integer> sort=new ArrayList<>(map.keySet());
        sort.sort((n1,n2)->map.get(n2)-map.get(n1)); 
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=sort.get(i);
        }
        return res;
    }
}