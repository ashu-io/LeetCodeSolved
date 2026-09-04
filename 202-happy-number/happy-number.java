class Solution {

    public int sumDigit(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10*(n%10);
            n=n/10;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = sumDigit(n);
        }

        return n == 1;
    }
    
}