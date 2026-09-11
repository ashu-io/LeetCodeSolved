class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int k=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[k++]=nums[i];
                count++;
            }
        }
        if(count>=3)
        {
            return nums[k-3];
        }
        else
        {
            return nums[k-1];
        }
        
        
    }
}