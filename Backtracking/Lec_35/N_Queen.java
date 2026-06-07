package Backtracking.Lec_35;

import java.util.ArrayList;
import java.util.List;
//leetcode 51
public class N_Queen {
    public static void main(String[] args) {
        
    }
    class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> res = new ArrayList<>();
        n_queen(board , n , 0 , res);
        return res;


        
    }
    public void n_queen(boolean[][] board , int n , int r , List<List<String>> res){
        if(n == 0){
            ArrayList<String> list = display(board);
            res.add(list);
            return;
        }

        for(int c = 0; c < board.length; c++) {
            if(is_safe(board , r , c)) {
                board[r][c] = true;
                n_queen(board , n-1 , r+1 , res);
                board[r][c] = false;
            }
        }
    }
    private boolean is_safe(boolean[][] board , int r , int c) {
        for(int i = 0; i < r; i++) {
            if(board[i][c]) return false;
        }

        for(int i = r-1 , j = c-1 ; i >= 0 && j >= 0 ; i-- , j--) {
            if(board[i][j]) return false;
        }
        for(int i = r-1 , j = c+1 ; i >= 0 && j < board.length; i-- , j++) {
            if(board[i][j]) return false;
        }
        return true;
    }
    private ArrayList<String> display(boolean[][] board){
        ArrayList<String> list = new ArrayList<>();
        for(boolean[] arr : board){
            String str = "";
            for(int i = 0; i < arr.length; i++) {
                if(arr[i]){
                    str = str + "Q";
                }else{
                    str = str + ".";
                }
            }
            list.add(str);
        }
        return list;
    }
    

}
}
