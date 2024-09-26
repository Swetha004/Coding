class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> l=new HashMap<>();
        for(int i=0;i<s.length();i++){
            l.put(s.charAt(i),l.getOrDefault(s.charAt(i),0)+1);
        }
        int len=0,x=0;
        for(int c:l.values()){
            if(c%2==0){
                len=len+c;
            }
            else{
                len=len+c-1;x++;
            }
        }
        return (x>0)?len+1:len;
    }
}