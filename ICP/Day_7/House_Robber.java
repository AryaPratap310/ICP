//https://leetcode.com/problems/house-robber/
package Day_7;

import java.util.Arrays;
public class House_Robber {
	class Solution {
	    public int rob(int[] arr) {
	      int dp[]=new int[arr.length];
			Arrays.fill(dp, -1);  
	        return Robber(arr,0,dp);
	    }
	    public static int Robber(int []arr,int i,int []dp) {
			if(i>arr.length-1) {
				return 0;
			}
			if(dp[i]!=-1) {
				return dp[i];
			}
			int rob=arr[i]+Robber(arr,i+2,dp);
			int notrob=Robber(arr,i+1,dp);
			return dp[i]=Math.max(rob, notrob);
		}
	}
}
//TC:O(N)
//SC:O(N)
