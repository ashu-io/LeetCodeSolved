class Solution {
    public long positiveReverse(int x)
    {
        long reverse=0;
        long temp=x;
        while(temp!=0)
        {
          reverse=(reverse*10)+temp%10;
          temp=temp/10;  
        }
        return reverse;
    }
    public long negativeReverse(int x)
    {
        x=-x;
        long reverse=0;
        long temp=x;
        while(temp!=0)
        {
         reverse=(reverse*10)+temp%10;
          temp=temp/10;  
        }
        reverse=-reverse;
        return reverse;
    }
    public int reverse(int x) {
        if(x<-Math.pow(2,31)||x>Math.pow(2,31)-1)
        {
            return 0;
        }
        long result;
        if(x>=0)
        {
            result=positiveReverse(x);
        }
        else
        {
            result=negativeReverse(x);
        }
        if(result<-Math.pow(2,31)||result>Math.pow(2,31)-1)
        {
            return 0;
        }
        return (int)result;
    }
}