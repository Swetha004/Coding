class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] a=new int[26];
        for(char c:s.toCharArray()){
            a[c-'a']++;
        }
        int[] b=new int[26];
        for(char c:t.toCharArray()){
            b[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)-'a']!=b[s.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
}