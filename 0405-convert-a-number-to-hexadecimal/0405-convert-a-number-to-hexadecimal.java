class Solution {
    public String toHex(int n) {
        StringBuilder s=new StringBuilder();
        if(n==0)
         return "0";
        long num=n;
        if(num<0){
                num=num + (long)Math.pow(2,32);
            }
        
        while(num!=0){
            long rem=num%16;
            if(rem<=9){
                s.append(rem);
            }
            else{
                char c=(char)('a'+rem-10);
                s.append(c);
            }
            num=num/16;
        }
        return s.reverse().toString();
    }
}