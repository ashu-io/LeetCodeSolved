class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int []arr=new int[nums.length];
        int e=0;
        for(int i:nums)
        {
            arr[e++]=i;
        }
        int index=0;
        for(int i=nums.length-k;i<nums.length;i++)
        {
            nums[index++]=arr[i];
        }
        for(int i=0;i<nums.length-k;i++)
        {
            nums[index++]=arr[i];
        }
        
        


    }
}