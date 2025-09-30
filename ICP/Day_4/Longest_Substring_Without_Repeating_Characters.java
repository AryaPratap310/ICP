//https://leetcode.com/problems/longest-substring-without-repeating-characters/
package Day_4;
import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {
	class Solution {
	    public int lengthOfLongestSubstring(String s) {
	        int si=0;
	        int ei=0;
	        int ans=0;
	        HashSet<Character> charSet = new HashSet<>();
	        while(ei<s.length()){
	            while(charSet.contains(s.charAt(ei))){
	                charSet.remove(s.charAt(si));
	                si++;
	            }
	            charSet.add(s.charAt(ei));
	            ans=Math.max(ans,ei-si+1);
	            ei++;
	        }
	        return ans;
	    }
	}
}
//TC:O(N)
//SC:O()
