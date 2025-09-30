//https://leetcode.com/problems/max-consecutive-ones-iii/
package Day_4;

public class Max_Consecutive_Ones {
	class Solution {
	    public int longestOnes(int[] nums, int k) {
	        int flip=0;
	        int si=0;
	        int ei=0;
	        int ans=0;
	        while(ei<nums.length){
	            //grow
	            if(nums[ei]==0){
	                flip++;
	            }

	            //shrink
	            while(flip>k){
	                if(nums[si]==0){
	                    flip--;
	                }
	                si++;
	            }
	            //ans update
	            ans=Math.max(ans,ei-si+1);
	            ei++;
	        }
	        return ans;
	    }
	}
	

}
//TC:O(n)
//SC:O(1)
