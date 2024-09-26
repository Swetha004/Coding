class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        int x=Math.min(nums1.length,nums2.length);
        
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && a.size()<x){
                    a.add(nums2[j]);
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int[] nums=new int[a.size()];
        for(int i=0;i<a.size();i++){
            nums[i]=a.get(i);
        }
        return nums;
    }
}