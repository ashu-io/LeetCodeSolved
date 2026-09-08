class Solution {
    public char findTheDifference(String s, String t) {
        int []count=new int[26];

        s=s+t;
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
        }


        for(int i=0;i<s.length();i++)
        {
            if(count[s.charAt(i)-'a']%2!=0)
            {
                return s.charAt(i);
            }
        }

    return ' ';
    }
}