package Day_6;

public class Word_Search {
	class Solution {
	    public boolean exist(char[][] board, String word) {
	        for(int i=0;i<board.length;i++){
	            for(int j=0;j<board[0].length;j++){
	                if(board[i][j]==word.charAt(0)){
	                    if (find(i,j,board,0,word)){
	                        return true;
	                    }
	                }
	            }
	        }
	        return false;
	    }
	    public boolean find(int cr,int cc,char[][]board,int idx,String word){
	        if(idx==word.length()){
	            return true;
	        }
	        if(cr<0 || cr>=board.length || cc<0 || cc>=board[0].length || word.charAt(idx)!=board[cr][cc]){
	            return false;
	        }
	        char x=board[cr][cc];
	        board[cr][cc]='#';
	        int [] r= {-1,0,1,0};
			int [] c= {0,-1,0,1};

			for(int i=0;i<c.length;i++) {            
				boolean ans=find(cr+r[i],cc+c[i],board,idx+1,word);
	            if (ans){
	                return true;
	            }
			}
	        board[cr][cc]=x;
	        return false;

	    }
	}
}
//TC: O(m * n * 4^L)   // L is length of the word(recurions depth)
//SC:O(L)
