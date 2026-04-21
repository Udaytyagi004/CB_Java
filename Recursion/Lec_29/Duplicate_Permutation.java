package Recursion.Lec_29;

public class Duplicate_Permutation {
    public static void main(String[] args) {
        
    }
    // public static void dup_per(String str , String ans) {
    //     int n = str.length();
    //     if(n == 0) {
    //         System.out.println(ans);
    //         return;
    //     } 
    //     for(int i = 0; i < n; i++) {
    //         ch = str.charAt(i);
    //         String s1 = str.substring(0 , i);
    //         String s2 = str.substring(i+1);
    //         if(s2.indexO(ch) != -1){
    //             continue;
    //         }
    //         dup_per(s1+s2, ans + ch);
    //     }
    // }
    public static void dup_per(String str , String ans) {
        int n = str.length();
        if(n == 0) {
            System.out.println(ans);
            return;
        } 
        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            boolean flag = true;
            for(int j = i+1; j < n; j++) {
                if(str.charAt(j) == ch){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                String s1 = str.substring(0 , i);
                String s2 = str.substring(i+1);
                dup_per(s1+s2, ans + ch);
            }
            
        }
    }
    
}
