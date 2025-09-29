package Day_3;

public class Number_Of_Islands {
	class Solution {
	    public int numIslands(char[][] grid) {
	        int m=grid.length;
	        int n=grid[0].length;
	        int number=0;
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(grid[i][j]=='1'){
	                    dfs(i,j,grid,m,n);
	                    number++;
	                }
	            }
	        }
	        return number;
	    }
	    
	    public void dfs(int i , int j, char[][]grid , int m ,int n){
	        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]!='1'){
	            return ;
	        }
	        grid[i][j]='#';
	        dfs(i-1,j,grid,m,n);
	        dfs(i,j-1,grid,m,n);
	        dfs(i+1,j,grid,m,n);
	        dfs(i,j+1,grid,m,n);
	    }
	}
}

//TC: O(m*n)
//SC: O(m*n)
