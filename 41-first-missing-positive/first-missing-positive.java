class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int positivestart=1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<positivestart)
            {
                continue;
            }
            else if(nums[i]==positivestart)
            {
                positivestart++;
            }
            else
            {
                return positivestart++;
            }
        }

        return positivestart;
    }
}