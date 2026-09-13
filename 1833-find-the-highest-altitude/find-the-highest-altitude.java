class Solution {
    public int largestAltitude(int[] gain) {
        int []leftSum=new int[gain.length+1];
        leftSum[0]=0;
        for(int i=1;i<=gain.length;i++)
        {
            leftSum[i]=leftSum[i-1]+gain[i-1];
        }

        int max=leftSum[0];
        for(int i=0;i<leftSum.length;i++)
        {
            if(leftSum[i]>max)
            {
                max=leftSum[i];
            }
        }
        return max;
    }
}