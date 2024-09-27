class Solution {
    public int countBinarySubstrings(String s) {
        int c1=1,c2=2;
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) c1++;
            else{
                l.add(c1);
                c1=1;
            }
        }
        l.add(c1);
        int res=0;
        for(int i=1;i<l.size();i++){
            res=res+Math.min(l.get(i-1),l.get(i));
        }
        return res;
    }
}