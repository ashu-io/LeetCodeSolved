class Solution {
    public int[] separateDigits(int[] nums) {
        List newList=new ArrayList();
        int count=0;
        for(int i:nums)
        {
            if(i>9)
            {
                while(i!=0)
                {
                    count++;
                    newList.add(i%10);
                    i=i/10;
                }
            }
            else
            {
                count++;
                newList.add(i);
            }
        }
        int []result=new int[count];
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>9)
            {

                while(nums[i]!=0)
                {
                 
                    result[--count]=nums[i]%10;
                    nums[i]=nums[i]/10;
                }
            }
            else
            {
               
                result[--count]=nums[i];
            }
        }
       // int k=0;
        //for(Object i:newList)
        //{
         //   result[k++]=(int)i;
        //}
        return result;
    }
}