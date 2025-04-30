class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ac=0,f=0,t=0,tw=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                f++;
            }
            else if(bills[i]==10){
                if(f==0) return false;
                t++;
                f--;
            }
            else if(bills[i]==20){
                if(f>0 && t>0) 
                {
                    f--;
                    t--;
                }
                else if(f>=3) f=f-3;
                else return false;
            }
        }
        return true;
    }
}