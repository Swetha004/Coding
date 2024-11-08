class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] distance=new int[n+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[k]=0;
        for(int i=0;i<n-1;i++){
            for(int[] ed:times){
                int u=ed[0];
                int v=ed[1];
                int wt=ed[2];
                if(distance[u]!=Integer.MAX_VALUE && distance[u]+wt<distance[v]){
                    distance[v]=distance[u]+wt;
                }
            }
        }
        int max=distance[1]; 
        for(int i=1;i<=n;i++){
            if(distance[i]==Integer.MAX_VALUE) return -1;
            else max = Math.max(max, distance[i]);
        }
        return max;
    }
}