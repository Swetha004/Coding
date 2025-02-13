class Solution {
    public boolean isop(String c){
        return c.equals("+")||c.equals("/")||c.equals("*")||c.equals("-");
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String c=tokens[i];
            if(!isop(c)){
                st.push(Integer.parseInt(c));
            }
            else{
                int n1=st.pop();
                int n2=st.pop();
                switch(c){
                    case "+": st.push(n2+n1); break;
                    case "-": st.push(n2-n1); break;
                    case "*": st.push(n2*n1); break;
                    case "/": st.push(n2/n1); break;
                }
            }
        }
        return st.pop();
    }
}