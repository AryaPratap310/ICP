//https://leetcode.com/problems/merge-sorted-array/

package Day_2;
public class Merge_Sorted_Array {

	class Solution {
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int i=0;
	        int j=0;
	        int k=0;
	        int arr[]=new int[m+n];
	        while(i<m && j<n){
	            if(nums1[i]<nums2[j]){
	                arr[k]=nums1[i];
	                i++;
	                k++;
	            }
	            else{
	                arr[k]=nums2[j];
	                j++;
	                k++;
	            }
	        }
	        while(i<m){
	            arr[k]=nums1[i];
	                i++;
	                k++;
	        }
	        while(j<n){
	            arr[k]=nums2[j];
	                j++;
	                k++;
	        }
	        for(int l=0;l<arr.length;l++){
	            nums1[l]=arr[l];
	        }
	        //  for(int q=0;q<arr.length;q++){
	        //     System.out.print(nums1[q]+" ");
	        // }
	        
	    }
	}

}
