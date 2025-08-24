class Solution {
    public String interpret(String command) {
        char a;
        int b=0,ch=0;
        StringBuilder sb=new StringBuilder();
        for(char c:command.toCharArray()){
            if(Character.isLetter(c) && c!='a' && c!='l'){
                sb.append(c);
            }
            else if(c=='('){
                b++;
                ch=0;
            }
            else if(c==')' && b!=0 && ch==0){
                sb.append('o');
            }
            else if(c=='a'){
                sb.append('a');
                ch++;
            }
            else if(c=='l'){
                sb.append('l');
                ch++;
            }
        }
        return sb.toString();
    }
}