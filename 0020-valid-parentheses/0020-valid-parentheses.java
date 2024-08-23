class Solution {
    public boolean isValid(String s) {
        char[] stack=new char[s.length()];
        int i=0;
        for(char c:s.toCharArray())
        {
            if(c=='{'||c=='['||c=='('){
                stack[i++]=c;
            }
            else
            {
                if(i==0) return false;
                if((c=='}' && stack[i-1]=='{')||(c==']' && stack[i-1]=='[')||(c==')' && stack[i-1]=='('))
                {
                    i--;
                }
                else
                {
                    return false;
                }
            }
        }
        return i==0;
    }
}