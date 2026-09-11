class Solution {
    public boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();
        char []ch=s.toCharArray();
        
        int left=0,right=ch.length-1;

        while(left<right)
        {
            if(!((ch[left]>='a' && ch[left]<='z')||(ch[left]>='A' && ch[left]<='Z')||(ch[left]>='0' && ch[left]<='9')))
            {
                left++;
                continue;
            }

            if(!((ch[right]>='a' && ch[right]<='z')||(ch[right]>='A' && ch[right]<='Z')||(ch[right]>='0' && ch[right]<='9')))
            {
                right--;
                continue;
            }

            if(ch[left]!=ch[right])
            {
                return false;
            }
            else
            {
                left++;
                right--;
                continue;
            }
        }
        return true;
    }
       
}