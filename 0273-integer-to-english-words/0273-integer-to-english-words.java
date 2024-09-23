class Solution {
    private final String[] belowTwenty={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private final String[] ten={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        return string(num);
    }
    public String string(int num){
        StringBuilder s=new StringBuilder();
        if(num<20){
            s.append(belowTwenty[num]);
        }
        else if(num<100){
            s.append(ten[num/10]).append(" ").append(belowTwenty[num%10]);
        }
        else if(num<1000){
            s.append(string(num/100)).append(" Hundred ").append(string(num%100));
        }
        else if(num<1000000){
            s.append(string(num/1000)).append(" Thousand ").append(string(num%1000));
        }
        else if(num<1000000000){
            s.append(string(num/1000000)).append(" Million ").append(string(num%1000000));
        }
        else{
            s.append(string(num/1000000000)).append(" Billion ").append(string(num%1000000000));
        }
        return s.toString().trim();
    }
}