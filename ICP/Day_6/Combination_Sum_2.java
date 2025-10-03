package Day_6;
import java.util.*;
public class Combination_Sum_2 {
	class Solution {
	    List<List<Integer>> ans=new ArrayList<>();
	    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        Arrays.sort(candidates);
	        create(candidates,target,0,new ArrayList<>());
	        return ans;
	    }
	    public void create(int []candidates , int target ,int idx,List<Integer> list){
	        if(target==0){
	            ans.add(new ArrayList<>(list));
	            return;
	        }
	        for(int i=idx;i<candidates.length;i++){
	            
	            if(i>idx && candidates[i]==candidates[i-1]){
	                continue;
	            }
	            if(target>=candidates[i]){
	                list.add(candidates[i]);
	                create(candidates,target-candidates[i],i+1,new ArrayList<>(list));
	                list.remove(list.size()-1);
	            }
	        }
	    }
	}

}
