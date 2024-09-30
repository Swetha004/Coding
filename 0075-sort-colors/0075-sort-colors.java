class Solution {
    public void sortColors(int[] a) {
        int red=0,white=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
                red++;
            if(a[i]==1)
                white++;
        }
        for(int i=0;i<red;i++){
            a[i]=0;
        }
        for(int i=red;i<red+white;i++){
            a[i]=1;
        }
        for(int i=red+white;i<a.length;i++){
            a[i]=2;
        }
    }
}