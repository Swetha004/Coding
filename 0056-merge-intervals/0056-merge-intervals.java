class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> l=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] a=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] n=intervals[i];
            if(a[1]>=n[0]){
                a[1]=Math.max(a[1],n[1]);
            }
            else{
                l.add(a);
                a=n;
            }
        }
        l.add(a);
        return l.toArray(new int[l.size()][]);
    }
}