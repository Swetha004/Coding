class Solution {
    public int maxNumberOfBalloons(String text) {
        String b=new String("balon");
        int k=0;
        int n=text.length();
        int[] a=new int[5];
        if(n>=7){
        for(int i=0;i<5;i++){
            for(int j=0;j<n;j++)
            {
                if(text.charAt(j)==b.charAt(i)){
                    a[i]++;
                }
            }
        }}
        else{
            return 0;
        }
        a[2]/=2;
        a[3]/=2;
        int min=a[0];
        for(int i=1;i<5;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
}