package Backtracking.Lec_34;

import java.util.ArrayList;
import java.util.List;

// Rat in a maze GFG    
public class RatChasesItsCheese {
    public static void main(String[] args) {
        
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        
        ArrayList<String> list = new ArrayList<>();
        maze(maze ,0 , 0, "" , list);
        
        return list;
        
    }
    public static void maze(int[][] board , int r , int c , String path , List<String> list) {
        
        if(r < 0 || c < 0 || r > board.length-1 || c > board.length-1 || board[r][c] == 0) return;
        
        if(r == board.length-1 && c == board.length-1) {
            list.add(path);
            return;
        }
        
        board[r][c] = 0;
        
        maze(board , r+1 , c , path + "D" , list);
        maze(board , r , c-1 , path + "L" , list);
        maze(board , r , c+1 , path + "R" , list);
        maze(board , r-1 , c , path + "U" , list);
        
        board[r][c] = 1;
    }
    
}
