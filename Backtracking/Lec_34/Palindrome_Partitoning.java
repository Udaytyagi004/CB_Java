package Backtracking.Lec_34;
import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitoning {
    public static void main(String[] args) {
        
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(s , new ArrayList<>() , res);
        return res;
    }
    private void helper(String str , List<String> ans , List<List<String>> res) {
        if(str.isEmpty()) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = 1; i <= str.length(); i++) {
            String s = str.substring(0 , i);
            if(!is_palin(s , 0 , s.length() - 1)) continue;
            ans.add(s);
            helper(str.substring(i) , ans , res);
            ans.remove(ans.size() - 1);
        }
    }
    private boolean is_palin(String str , int s , int e) {
        if(s > e) return true;
        if(str.charAt(s) != str.charAt(e)) return false;
        return is_palin(str , s+1 , e-1);
        
    }
}
