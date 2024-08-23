class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        List<Character> st=new ArrayList<>();
        s=s.toLowerCase();
        for(int i=n-1;i>=0;i--)
        {
           if(s.charAt(i)>='a' &&  s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9')
           {
              st.add(s.charAt(i));
           }
        }
        int x=0,j=2;
        int size=st.size();
        for(int i=0;i<size/2;i++)
        {
            if(st.get(i) != st.get(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}