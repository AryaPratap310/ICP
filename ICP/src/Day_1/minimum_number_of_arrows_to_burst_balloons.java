package Day_1;

import java.util.*;

//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/

public class minimum_number_of_arrows_to_burst_balloons {
	class Solution {
	    public int findMinArrowShots(int[][] points) {
	        if (points.length==1) {
	            return 1;
	        }
	        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
	        int arrows=1;
	        int prev=0;
	        for(int i=0;i<points.length;i++){
	            if(points[i][0]>points[prev][1]){
	                arrows++;
	                prev=i;
	            }
	        }
	        return arrows;

	    }
	}
}
