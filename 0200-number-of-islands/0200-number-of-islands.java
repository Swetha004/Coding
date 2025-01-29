class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }
        int ic=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]=='1'){
                    ic++;
                    dfs(grid,r,c,grid.length,grid[0].length);
                }
            }
        }
        return ic;
    }
    public void dfs(char[][] grid,int r,int c,int row,int col){
        if(r<0 || c<0 || r>=row || c>=col || grid[r][c]=='0'){
            return ;
        }
        grid[r][c]='0';
        dfs(grid,r+1,c,row,col);
        dfs(grid,r-1,c,row,col);
        dfs(grid,r,c+1,row,col);
        dfs(grid,r,c-1,row,col);
    }
}