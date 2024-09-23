class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> ugly=new ArrayList<Integer>();
        ugly.add(1);
        int i2=0;
        int i3=0;
        int i5=0;
        while(ugly.size()<n){
            final int n2=ugly.get(i2)*2;
            final int n3=ugly.get(i3)*3;
            final int n5=ugly.get(i5)*5;
            final int nt=Math.min(Math.min(n2,n3),n5);
            if(nt==n2) i2++;
            if(nt==n3) i3++;
            if(nt==n5) i5++;
            ugly.add(nt);
        }
        return ugly.get(ugly.size()-1);
    }
}