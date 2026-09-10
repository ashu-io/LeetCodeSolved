class Solution {

    public boolean compareString(char[] ch1,char[] ch2,int index)
    {
        for(int i=0;i<ch2.length;i++)
        {
            if(index>=ch1.length)
            {
                return false;
            }
            if(ch2[i]!=ch1[index++])
            {
                return false;
            }
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
        char ch1[]=haystack.toCharArray();
        char ch2[]=needle.toCharArray();

        for(int i=0;i<haystack.length();i++)
        {
            if(ch1[i]==ch2[0])
            {
                if(compareString(ch1,ch2,i))
                {
                    return i;
                }
            }
        }
        return -1;
    }
}