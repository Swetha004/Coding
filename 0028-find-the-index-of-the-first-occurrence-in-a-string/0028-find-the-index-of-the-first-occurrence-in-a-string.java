class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int k=i;
            int x=0;
            for(int j=0;j<needle.length();j++){
                if(needle.charAt(j)==haystack.charAt(k)){
                    k++;
                    x++;
                }
                else{
                    break;
                }
                if(x==needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}