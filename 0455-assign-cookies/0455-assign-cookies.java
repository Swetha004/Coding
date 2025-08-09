class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(s[j]>=g[i]){
                    count=count+1;
                    s[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
        return count;
    }
}