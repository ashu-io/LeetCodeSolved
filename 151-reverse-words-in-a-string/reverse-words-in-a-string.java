class Solution {
    public String reverseWords(String s) {
        String[] stringletters=s.trim().split("\\s+");
        
        StringBuilder result=new StringBuilder();
        for(int i=stringletters.length-1;i>=0;i--)
        {
            result.append(stringletters[i]);
            if(i>0)
            {
                result.append(" ");
            }
        }
        return result.toString();
    }
}