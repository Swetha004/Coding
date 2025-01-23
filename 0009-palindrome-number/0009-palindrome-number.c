bool isPalindrome(int x)
{
     int n;
     long long rev=0;
     n=x;
     while(n!=0)
     {
        int rem=n%10;
         rev=rev*10+rem;
         n=n/10;
     }
     if(x<0)
     {
         return 0;
     }
     if(x==rev)
     {
         return 1;
     }
     else
     {
         return 0;
     }
}