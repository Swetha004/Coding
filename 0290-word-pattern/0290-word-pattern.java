class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        HashMap<Character,String> p=new HashMap<>();
        HashMap<String,Character> st=new HashMap<>();
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String w=words[i];
            if(p.containsKey(c)){
                if(!p.get(c).equals(w)){
                    return false;
                }
            }
            else{
                p.put(c,w);
            }
            if(st.containsKey(w)){
                if(st.get(w)!=c){
                    return false;
                }
            }
            else{
                st.put(w,c);
            }
        }
        return true;
    }
}