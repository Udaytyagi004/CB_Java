package Recursion.Lec_27;

import java.util.ArrayList;

public class Main {
    

   public static void main(String[] args) {
    System.out.println(fact(5 , 1));
    ArrayList<String> ans = new ArrayList<>();
    SubSeq("abc", 0, ans, "");
    System.out.println(ans);
   }

   // Factorial (tail-recursion) 

   public static int fact(int n , int ans) {
    if(n == 0) return ans;
    return fact(n-1 , n * ans);
   }

   // searching an element
   public static int find(int[] arr ,int i , int target){
    if(i == arr.length) return -1;
    if(arr[i] == target) return i;
    return find(arr , i+1 , target);
   }


   // subsequence 
   public static void SubSeq(String str , int i , ArrayList<String> ans ,  String path) {
      if(i == str.length()){
         ans.add(path);
         return;
      }
      char ch = str.charAt(i);
      SubSeq(str, i+1, ans, path);
      SubSeq(str, i+1, ans, path+ch);
   }
}
