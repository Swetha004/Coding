class Solution {
    public int addDigits(int num) {
        int sum=10;
        while(sum>=10){
            sum=0;
            while(num!=0){
                sum=sum+num%10;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}