class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isdiv(i)){
                a.add(i);
            }
        }
        return a;
    }
    public boolean isdiv(int i){
            int n=i;
            while(n>0){
                int rem=n%10;
                if(rem==0 || i%rem!=0){
                    return false;
                }
                n=n/10;
            }
            return true;
    }
}