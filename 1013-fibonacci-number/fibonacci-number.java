class Solution {
    public int fib(int n) {
        if(n==0)
        {
            return 0;
        }
        
        if(n==1)
        {
            return 1;
        }
        int start=1;
        int next=1;
        while(n!=2)
        {
            int temp=next;
            next+=start;
            start=temp;
            n--;
        }
        return next;
    }
}