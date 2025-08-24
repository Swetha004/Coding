class Solution {
    public boolean isValid(String s) {
        int top=-1;
        char[] stack=new char[s.length()];
        for(char c:s.toCharArray()){
            if(c=='(') stack[++top]=')';
            else if(c=='[') stack[++top]=']';
            else if(c=='{') stack[++top]='}';
            else if(top==-1 || stack[top--]!=c) return false;
        }
        return top==-1;
    }
}