import java.util.*;

class Solution {
    public boolean isop(String c) {
        return c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/");
    } 

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String ch = tokens[i];
            if (!isop(ch)) {
                st.push(Integer.parseInt(ch));
            } else {
                int n1 = st.pop();
                int n2 = st.pop();
                switch (ch) {
                    case "+": st.push(n2 + n1); break;
                    case "-": st.push(n2 - n1); break;
                    case "*": st.push(n2 * n1); break;
                    case "/": st.push(n2 / n1); break;  // Corrected division order
                }
            }
        }
        return st.pop();
    }
}
