package Recursion.Lec_29;

public class GenerateParenthesis {
    public static void main(String[] args) {
        paren(0 , 0 , 3 , "");
    }
     public static void paren(int open , int close , int n , String path) {
        if(open == n && close == n) {
            System.out.println(path);
            return;
        }
        if(open < n){
            paren(open+1 , close , n , path + "(");
        }
        if(close <  open){
            paren(open , close+1 , n ,path + ")");
        }
    }
}
