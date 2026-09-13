class Solution {
    public long sumAndMultiply(int n) {
        long newNumber=0,sum=0;
        while(n!=0)
        {
            if(n%10!=0)
            {
            newNumber=newNumber*10+(n%10);
            sum+=n%10;
            }
            n=n/10;
        }
        long reversedNumber=0;
        while(newNumber!=0)
        {
            reversedNumber=reversedNumber*10+(newNumber%10);
            newNumber/=10;
        }

        return sum*reversedNumber;


    }
}