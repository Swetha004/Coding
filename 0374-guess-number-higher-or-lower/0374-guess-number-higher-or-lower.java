public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low=0,high=n,x=0,mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            x=guess(mid);
            if(x==0){
                return mid;
            }
            else if(x==-1){
                high=mid-1;
            }
            else if(x==1){
                low=mid+1;
            }
        }
        return mid;
    }
}