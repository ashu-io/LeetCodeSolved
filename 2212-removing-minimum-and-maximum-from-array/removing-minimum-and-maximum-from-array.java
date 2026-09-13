class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex=0,maxIndex=0;
        int min=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                minIndex=i;
            }
            else if(nums[i]>max)
            {
                max=nums[i];
                maxIndex=i;
            }
        }

        int start=Math.min(minIndex,maxIndex);
        int last=Math.max(minIndex,maxIndex);
        int result=Math.min(last+1,nums.length-start);
        result=Math.min(result,((start+1)+(nums.length-last)));
        /*
        if(minIndex< (nums.length/2)&&maxIndex <(nums.length/2))
        {
            return Math.max(minIndex,maxIndex)+1;
        }
        else if(minIndex< (nums.length/2)&&maxIndex >(nums.length/2))
        {
            return minIndex+nums.length-maxIndex+1;
        }
        else if(minIndex> (nums.length/2)&&maxIndex <(nums.length/2))
        {
            return maxIndex+nums.length-minIndex+1;
        }
        else if(minIndex> (nums.length/2)&&maxIndex >(nums.length/2))
        {
            return nums.length-Math.max(minIndex,maxIndex)+1;
        }
        
        return 1;
        }*/
    return result;
    }
}