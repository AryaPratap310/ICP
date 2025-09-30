//https://leetcode.com/problems/find-all-anagrams-in-a-string/
package Day_4;

import java.util.*;

public class Find_All_Anagrams_in_a_String {
	class Solution {
	    public List<Integer> findAnagrams(String s2, String s1) {
	        ArrayList<Integer> ll=new ArrayList<>();
	        if (s1.length() > s2.length()) {
	            return ll;
	        }
	        HashMap<Character, Integer> s1map = new HashMap<>();
	        HashMap<Character, Integer> s2map = new HashMap<>();
	        for(int i=0;i<s1.length();i++){
	            s1map.put(s1.charAt(i),s1map.getOrDefault(s1.charAt(i),0)+1);
	            s2map.put(s2.charAt(i),s2map.getOrDefault(s2.charAt(i),0)+1);
	        }

	        if(s1map.equals(s2map)){
	            ll.add(0);
	        }
	        int l=0;
	        for(int r=s1.length();r<s2.length();r++){
	            s2map.put(s2.charAt(r),s2map.getOrDefault(s2.charAt(r),0)+1);
	            s2map.put(s2.charAt(l),s2map.get(s2.charAt(l))-1);
	            s2map.remove(s2.charAt(l),0);
	            
	            l++;
	            if(s1map.equals(s2map)){
	                ll.add(l);
	            }
	        }
	        return ll; 
	    }
	}
}

//TC:O(|s1|+|s2|)
//SC:O(1)
