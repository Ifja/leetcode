class Solution {
    public void rotate(int[][] A) {
          //transpose
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                int temp= A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
        //reverse each row
        for(int i=0;i<A.length;i++){
            int low=0, high=A.length-1;
            while(low<high){
                int temp= A[i][low];
                A[i][low]=A[i][high];
                A[i][high]=temp;
                low++;
                high--;
            }
        }
    }
}