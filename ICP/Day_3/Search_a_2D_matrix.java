package Day_3;

public class Search_a_2D_matrix {
	class Solution {
	    public boolean searchMatrix(int[][] matrix, int target) { 
	        int m=matrix.length;
	        int n=matrix[0].length;
	        int l=0;
	        int h=m*n-1;
	        while(l<=h){
	            int mid=(l+h)/2;
	            int midval=matrix[mid/n][mid%n];
	            if(midval==target){
	                return true;
	            }
	            else if(midval<target){
	                l=mid+1;
	            }
	            else{
	                h=mid-1;
	            }
	        }
	        return false;
			
	    }
	}
}

//TC: O(log(m*n))
//SC: O(1)
