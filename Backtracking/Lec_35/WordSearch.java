package Backtracking.Lec_35;

// leetcode 79
public class WordSearch {
    public static void main(String[] args) {
        
    }
     public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] != word.charAt(0)) continue;
                boolean flag = word(board , i , j , word);
                if(flag) return flag;
            }
        }
        return false;
    }
    private boolean word(char[][] board , int r , int  c, String str) {
        if(str.length() == 0) return true;
        
        if(r < 0 || r >= board.length || c < 0 || c >= board[r].length || str.charAt(0) != board[r][c]) return false;
    
        int[] R = {0 , 1 , 0 , -1};
        int[] C = {1 , 0 ,-1 , 0};
        char ch = board[r][c];
        board[r][c] = '*';
        for(int k = 0; k < R.length; k++){
            boolean flag = word(board, r + R[k] , c + C[k] , str.substring(1));
            if(flag) return flag;
        }
        board[r][c] = ch;
       
        return false;
    }
    
}
