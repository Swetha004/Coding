class Solution {
    public String largestNumber(int[] nums) {
        String[] ar=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            ar[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(ar,(a,b)->(b+a).compareTo(a+b));
        if(ar[0].equals("0")){
            return "0";
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<ar.length;i++){
            s.append(ar[i]);
        }return s.toString();
    }
}