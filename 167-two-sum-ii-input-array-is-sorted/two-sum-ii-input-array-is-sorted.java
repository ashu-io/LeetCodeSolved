class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[]={0,0};
        int i=0,j=numbers.length-1;
        while(i<=j)
        {
            if(numbers[i]+numbers[j]==target)
            {
                result[0]=i+1;
                result[1]=j+1;
                return result;
            }
            else if(numbers[i]+numbers[j]<target)
            {
                i++;
            }
            else if(numbers[i]+numbers[j]>target)
            {
                j--;
            }
            
        }
        return result;
    }
}