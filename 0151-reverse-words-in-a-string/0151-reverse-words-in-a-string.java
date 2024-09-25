class Solution {
    public String reverseWords(String s) {
        String re[]=s.trim().split("\\s+");
        StringBuilder st=new StringBuilder();
        for(int i=re.length-1;i>=0;i--){
            st.append(re[i]);
            st.append(" ");
        }
        return st.toString().trim();
    }
}