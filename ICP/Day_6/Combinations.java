package Day_6;

import java.util.*;

public class Combinations {
	class Solution {
	    public List<List<Integer>> combine(int n, int k) {
	        List<Integer> list=new ArrayList<>();
	        List<List<Integer>> ans=new ArrayList<>();
	        comb(n,k,1,list,ans);
	        return ans;
	    }
	    public void comb(int n,int k,int idx,List<Integer> list,List<List<Integer>> ans){
	        if(list.size()==k){
	            ans.add(new ArrayList<>(list));
	            return;
	        }
	        for(int i=idx;i<=n;i++){
	            list.add(i);
	            comb(n,k,i+1,list,ans);
	            list.remove(list.size()-1);
	        }
	    }
	}
}
//TC:O(C(n, k) * k)
//SC:O(k + C(n, k) * k)
