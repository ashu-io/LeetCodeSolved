class Solution {
    public String reverseVowels(String s) {
        char []ch=s.toCharArray();
        int []indexes=new int[s.length()];
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
            {
                indexes[count++]=i;
            }
        }
        if(count==0)
        {
            return s;
        }
        int last=count-1;
        for(int i=0;i<count/2;i++)
        {
            char temp=ch[indexes[i]];
            ch[indexes[i]]=ch[indexes[last]];
            ch[indexes[last--]]=temp;
        }
        return new String(ch);
    }
}