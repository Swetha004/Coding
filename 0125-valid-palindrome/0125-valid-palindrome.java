class Solution {
    public boolean isPalindrome(String str) {
        String s=str.toLowerCase();
        int left=0,right=str.length()-1;
        while(left<right){
            if(Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))){
                if(s.charAt(left)==s.charAt(right)){
                    left++;
                    right--;
                    continue;
                }
                else{
                    return false;
                }
            }
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
        }
        return true;
    }
}