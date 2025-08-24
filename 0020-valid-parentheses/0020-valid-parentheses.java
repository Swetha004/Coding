class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> al=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                al.add(c);
            }
            else{
                if(al.isEmpty()) return false;
                int n=al.size()-1;
                if((al.get(n)=='(' && c!=')') || (al.get(n)=='{' && c!='}') || (al.get(n)=='[' && c!=']')){
                    return false;
                }
                al.remove(n);
            }
        }
        return al.isEmpty();
    }
}