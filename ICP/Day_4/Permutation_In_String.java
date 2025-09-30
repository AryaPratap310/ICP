//https://leetcode.com/problems/permutation-in-string/
package Day_4;

import java.util.HashMap;

public class Permutation_In_String {
	class Solution {
	    public boolean checkInclusion(String s1, String s2) {
	        if (s1.length() > s2.length()) {
	            return false;
	        }
	        HashMap<Character, Integer> s1map = new HashMap<>();
	        HashMap<Character, Integer> s2map = new HashMap<>();
	        for(int i=0;i<s1.length();i++){
	            s1map.put(s1.charAt(i),s1map.getOrDefault(s1.charAt(i),0)+1);
	            s2map.put(s2.charAt(i),s2map.getOrDefault(s2.charAt(i),0)+1);
	        }

	        if(s1map.equals(s2map)){
	            return true;
	        }
	        int l=0;
	        for(int r=s1.length();r<s2.length();r++){
	            s2map.put(s2.charAt(r),s2map.getOrDefault(s2.charAt(r),0)+1);
	            s2map.put(s2.charAt(l),s2map.get(s2.charAt(l))-1);
	            s2map.remove(s2.charAt(l),0);
	            l++;
	            if(s1map.equals(s2map)){
	                return true;
	            }
	        }
	        return false; 
	    }
	}
}
//TC:O(s1+s2)
//SC:O(1) 2 hashmap of 26 size each