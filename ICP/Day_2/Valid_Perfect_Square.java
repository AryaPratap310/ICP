//https://leetcode.com/problems/valid-perfect-square/

package Day_2;
public class Valid_Perfect_Square {

	class Solution {
	    public boolean isPerfectSquare(int num) {
	        long l=1;
	        long h=num;
	        while(l<=h){
	            long m=l+(h-l)/2;
	            if(m*m==num){
	                return true;
	            }
	            else if(m*m<num){
	                l=m+1;
	            }
	            else{
	                h=m-1;
	            }
	        }
	        return false;
	    }
	}

}
