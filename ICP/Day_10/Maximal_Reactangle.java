package Day_10;

import java.util.*;

public class Maximal_Reactangle {
	class Solution {
	    public int maximalRectangle(char[][] matrix) {
	        int arr[]=new int[matrix[0].length];
	        int ans=0;
	        for(int i=0;i<matrix.length;i++){
	            for(int j=0;j<matrix[0].length;j++){
	                if(matrix[i][j]=='0'){
	                    arr[j]=0;
	                }
	                else{
	                    arr[j]++;
	                }
	            }
	            ans=Math.max(ans,newhistogram(arr));
	        }
	        return ans;
	    }
	    public static int newhistogram(int arr[]) {
	        Stack<Integer> st=new Stack<>();
			int ans=0;
			for(int i=0;i<=arr.length;i++) {
	            int val=(i==arr.length)?0:arr[i];
	            while(!st.isEmpty() && arr[st.peek()]>val){
	                int nsr=i;  // next smaller element
	                int tbs=st.pop();  // to be solved
	                int nsl=st.isEmpty()?-1:st.peek();  // previous smaller element
	                ans=Math.max(ans,(nsr-nsl-1)*arr[tbs]);
	            }
	            st.push(i);
	        }
	        return ans;
	    }
	}

}
