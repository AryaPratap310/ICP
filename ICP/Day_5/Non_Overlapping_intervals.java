package Day_5;

import java.util.Arrays;

public class Non_Overlapping_intervals {
	class Solution {
	    public int eraseOverlapIntervals(int[][] intervals) {
	        int n=intervals.length;
	        Arrays.sort(intervals,(a,b) -> a[1]-b[1]);
	        int ans=0;
	        int lastend=intervals[0][1];
	        for(int i=1;i<n;i++){
	            if(intervals[i][0]<lastend){
	                ans++;
	            }
	            else{
	                lastend=intervals[i][1];
	            }
	        }
	        return ans;
	    }
	}
}
//TC:O(NlogN)
//SC:O(n)
