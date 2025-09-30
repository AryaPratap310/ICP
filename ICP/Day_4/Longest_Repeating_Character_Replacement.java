//https://leetcode.com/problems/longest-repeating-character-replacement/
package Day_4;

import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {
	class Solution {
	    public int characterReplacement(String s, int k) {
	        HashMap<Character,Integer> map=new HashMap<>();
	        int l=0;
	        int r=0;
	        int ans=0;
	        int maxfreq=0;
	        while(r<s.length()){
	            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
	            maxfreq=Math.max(maxfreq,map.get(s.charAt(r)));

	            while(r-l+1-maxfreq>k){
	                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
	                l++;
	            }
	            ans=Math.max(ans,r-l+1);
	            r++;
	        }
	        return ans;
	    }
	}
}
//TC:O(n)
//SC:O(1)
