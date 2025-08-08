class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            int x=1;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    x=0;
                    break;
                }
            }
            if(x==1){
                return i;
            }
        }
        return -1;
    }
}