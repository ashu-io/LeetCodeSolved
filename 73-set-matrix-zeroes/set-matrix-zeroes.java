class Solution {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int column=matrix[0].length;
        int []column1=new int[row];
        int []column2=new int[column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(matrix[i][j]==0)
                {
                    column1[i]=1;
                    column2[j]=1;
                }
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(column1[i]==1||column2[j]==1)
                {
                   matrix[i][j]=0;
                }
            }
        }
        
    }
}