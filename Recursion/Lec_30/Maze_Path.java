package Recursion.Lec_30;

public class Maze_Path {
     public static void main(String[] args) {
        System.out.println(maze(0 , 0 , 3 , ""));
        path_combination("VVHH" , "");
    }
    public static int maze(int r , int c ,int n ,String path) {
        if(r == n-1 && c == n-1) {
            System.out.println(path);
            return 1;
        }
        int a = 0;
        if(r < n-1) {
           a += maze(r+1 , c , n , path + "V");
        }
        if(c < n-1) {
            a += maze(r , c+1 , n , path + "H");
        }
        return a;
    }
    public static void path_combination(String str , String path) {
        if(str.length() == 0) {
            System.out.println(path);
            return;
        }
        int n = str.length();
        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            boolean flag = true;
            for(int j = i+1 ; j < n ; j++) {
                if(str.charAt(j) == ch) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                path_combination(str.substring(0 , i) + str.substring(i+1) , path + ch);
            } 
        }
    }
    
}
