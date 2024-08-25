class Solution {
    public String addStrings(String num1, String num2) {
       int i=num1.length()-1,j=num2.length()-1,c=0;
       StringBuilder s=new StringBuilder();
       while(i>=0||j>=0||c!=0){
        int x=(i>=0)?(num1.charAt(i)-'0'):0;
        int y=(j>=0)?(num2.charAt(j)-'0'):0;
        int sum=x+y+c;
        s.append(sum%10);
        c=sum/10;
        i--;
        j--;
       }
       return s.reverse().toString();
    }
}