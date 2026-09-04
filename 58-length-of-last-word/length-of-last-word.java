class Solution {
    public int lengthOfLastWord(String s) {

        String []parts=s.split(" ");
        return parts[parts.length-1].length();
        /*
        int count=0;
        char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            if(ch[i]==" ")
            {
                break;
            }
            else
            {
                count++;
            }
        }
        return count;
        */
    }
}