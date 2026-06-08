package Recursion.Lec_30;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phone_keypad {
    public static void main(String[] args) {
        
    }
     public List<String> letterCombinations(String digits) {
        HashMap<Character , String> map = new HashMap<>();
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");

        List<String> res = new ArrayList<>();
        helper(digits , "" , res , map);
        return res;
    }
    public void helper(String str , String path , List<String> list , HashMap<Character , String> map) {
        if(str.length() == 0){
            list.add(path);
            return;
        }
        char ch = str.charAt(0);
        String s = map.get(ch);
        for(int i = 0; i < s.length(); i++) {
            helper(str.substring(1) , path + s.charAt(i) , list , map);
        }
    }

}
