package Day_5;
import java.util.Arrays;
public class Boats_to_Save_People {
  class Solution {
	    public int numRescueBoats(int[] people, int limit) {
	        Arrays.sort(people);
	        int boat=0;
	        int i=0;
	        int j=people.length-1;
	        while(i<=j){
	            if(people[i]+people[j]<=limit){
	                boat++;
	                i++;
	                j--;
	            }
	            else{
	                boat++;
	                j--;
	            }
	        }
	        return boat;
	    }
	}
}
//TC:O(NlogN)
//SC:O(1)


