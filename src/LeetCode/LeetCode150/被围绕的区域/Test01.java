package LeetCode.LeetCode150.被围绕的区域;

public class Test01 {
	public static void main(String[] args) {

	}

	public static void solve(char[][] board) {
		if(board==null && board.length==0){
			return ;
		}

		for(int i=0;i<board.length;i++){
			for (int j = 0; j < board[i].length; j++) {
				if(i==0 || i==board.length-1 || j==0 || j==board[i].length-1){
					if(board[i][j]=='O'){
						dfs(board,i,j);
					}
				}
			}
		}

		// 所有O全部替换成X，所有#全部替换成O
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				if(board[i][j]=='O'){
					board[i][j] = 'X' ;
				}

				if(board[i][j]=='#'){
					board[i][j] = 'O' ;
				}
			}
		}
	}

	/**
	 * 与边界联通的O全部替换成#
	 * @param board
	 * @param i
	 * @param j
	 */
	public static void dfs(char[][] board,int i,int j){
		if(i<0 || i>=board.length || j<0 || j>board[i].length || board[i][j]=='X' || board[i][j]=='#'){
			return ;
		}
		board[i][j] = '#' ;
		dfs(board,i-1,j) ;
		dfs(board,i+1,j) ;
		dfs(board,i,j+1) ;
		dfs(board,i,j-1) ;
	}
}
