package Day_10;
import java.util.*;
public class Remove_All_Adjacent_Duplicates_in_String_2 {
	class Solution {
	    public String removeDuplicates(String s, int k) {
	        ArrayDeque<Adjacent> st = new ArrayDeque<>(s.length());
	        for (char c : s.toCharArray()) {
	            if (!st.isEmpty() && st.peekLast().ch == c) {
	                st.peekLast().freq++;
	            } else {
	                st.addLast(new Adjacent(c, 1));
	            }
	            if (st.peekLast().freq == k){
	                st.removeLast();
	            }
	        }
	        StringBuilder sb = new StringBuilder();
	        for (Adjacent a : st) {
	            sb.append(String.valueOf(a.ch).repeat(a.freq));
	        }
	        return sb.toString();
	    }
	    class Adjacent {
	        char ch;
	        int freq;
	        public Adjacent(char ch, int freq) {
	            this.ch = ch;
	            this.freq = freq;
	        }
	    }
	}
}
