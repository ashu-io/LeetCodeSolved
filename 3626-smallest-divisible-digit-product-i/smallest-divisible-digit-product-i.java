class Solution {
    public int productNumber(int temp)
    {
        int product=1;
        while(temp!=0)
        {
            product*=(temp%10);
            temp=temp/10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        
        while(productNumber(n)%t!=0)
        {
            n++;
        }

        return n;
    }
}