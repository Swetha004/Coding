class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] distance=new int[n+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src]=0;
        int []temp=Arrays.copyOf(distance,n);
        for(int i=0;i<=k;i++)
        {
            for(int[] ed:flights)
            {
                int u=ed[0];
                int v=ed[1];
                int price=ed[2];
                if(distance[u]!=Integer.MAX_VALUE && distance[u]+price<temp[v]){
                    temp[v]=distance[u]+price;
                }
            }
            distance=Arrays.copyOf(temp,n);
        }
        return distance[dst]==Integer.MAX_VALUE?-1:distance[dst];
    }
}