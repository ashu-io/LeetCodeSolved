class Solution {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int column=matrix[0].length;
        boolean []column1=new boolean[row];
        boolean []column2=new boolean[column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(matrix[i][j]==0)
                {
                    column1[i]=true;
                    column2[j]=true;
                }
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(column1[i]||column2[j])
                {
                   matrix[i][j]=0;
                }
            }
        }
        
    }
}