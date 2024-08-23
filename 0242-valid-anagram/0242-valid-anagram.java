class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char[] ca1=s.toCharArray();
        char[] ca2=t.toCharArray();
        Arrays.sort(ca1);
        Arrays.sort(ca2);
        String x=new String(ca1);
        String y=new String(ca2);
        return x.equals(y);
    }
}