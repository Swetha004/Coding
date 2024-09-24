class Solution {
    public int[] decrypt(int[] code, int k) {
        int s=0;
        int[] a=new int[code.length];
        if(k==0){
            return a;
        }
        else if(k>0){
            for(int i=0;i<code.length;i++){
                s=0;
                for(int j=1;j<=k;j++){
                    s=s+code[(i+j)%code.length];
                }
                a[i]=s;
            }
        }
        else
        {
            for(int i=0;i<code.length;i++){
                s=0;
                for(int j=1;j<=-1*k;j++){
                    s=s+code[(i-j+code.length)%code.length];
                }
                a[i]=s;
            }
        }
        return a;
    }
}