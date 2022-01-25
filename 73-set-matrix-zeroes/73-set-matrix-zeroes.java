class Solution {
    public void setZeroes(int[][] matrix) {
        int fR=-1,fC=-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(j==0) fC=0;
                    if(i==0) fR=0;
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
        } 
    }
      //columns
            for(int j=1; j<matrix[0].length;j++){
                if(matrix[0][j]==0){
                    for(int i=1;i<matrix.length;i++){
                        matrix[i][j]=0;
                }
            }
        }
        
        //rows
            for(int j=1; j<matrix.length;j++){
                if(matrix[j][0]==0){
                    for(int i=1;i<matrix[0].length;i++){
                        matrix[j][i]=0;
                }
            }
        }
        
        if(fR==0){
            for(int i=0;i<matrix[0].length;i++)
                 matrix[0][i]=0;
        }
        if(fC==0){
            for(int i=0;i<matrix.length;i++)
                 matrix[i][0]=0;
        }
    }        
}