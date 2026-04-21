public class Permutation {
    public static void main(String[] args) {
        permutation("abc" , "");
    } 
    public static void permutation(String str , String ans) {
        int n = str.length();
        if(n == 0) {
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            String s1 = str.substring(0 , i);
            String s2 = str.substring(i+1);
            permutation(s1+s2 , ans + ch);
        }
    }
}
