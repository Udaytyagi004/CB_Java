// package Lec_45;

// import java.util.*;

// public class FindCelebrrity {
//     public static void main(String[] args) {
        

//     }
//     public static int findCelebrity(int n){
//         Stack<Integer> st = new Stack<>();
//         for(int i  = 0; i < n; i++){
//             st.push(i);
//         }
//         while(st.size() != 1){
//             int a = st.pop();
//             int b = st.pop();
//              if(knows(a, b)){
//                 st.push(b);
//             }else{
//                 st.push(a);
//         }
//         }
        

//     }
//  public static int[][] mat = {
//     {0 , 1 , 1 , 1},
//     {1 , 0 , 1 , 1},
//     {0 , 0 , 0 , 0},
//     {1 , 1 , 1 , 0}
//  };
//     public static boolean knows(int i , int j){
//         if(mat[i][j] == 1) return true;
//         return false;
//     }
// }
