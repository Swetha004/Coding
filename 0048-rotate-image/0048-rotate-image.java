class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] d=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                d[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[j][n-i-1]=d[i][j];
            }
        }
    }
}