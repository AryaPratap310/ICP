//https://leetcode.com/problems/kth-largest-element-in-an-array/description/

package Day_2;
import java.util.*;
public class Kth_Largest_Element_In_Array {
	class Solution {
	    public int findKthLargest(int[] arr, int k) {

	        // we will make a min heap of size k only so that on top we get the kth largest element 
	        PriorityQueue<Integer> pq=new PriorityQueue<>();
	        for(int i=0;i<k;i++){
	            pq.add(arr[i]);
	        }
	        for(int i=k;i<arr.length;i++){
	            if(arr[i]>pq.peek()){
	                pq.poll();
	                pq.add(arr[i]);
	            }
	        }
	        return pq.peek();
	    }
	}
}
