class Solution {
    public int trap(int[] a) {
        int n=a.length;
        int sum=0;
        int[] p=new int[n];
        int[] s=new int[n];
        p[0]=a[0];
        s[n-1]=a[n-1];
        for(int i=1;i<n;i++){
            p[i]=Math.max(a[i],p[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            s[i]=Math.max(a[i],s[i+1]);
        }
        for(int i=0;i<n;i++){
            sum=sum+(Math.min(p[i],s[i])-a[i]);
        }
        return sum;
    }
}