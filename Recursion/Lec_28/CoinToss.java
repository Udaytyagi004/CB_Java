package Recursion.Lec_28;

public class CoinToss {
    public static void main(String[] args) {
        coinToss(3, "");
    }
    public static void coinToss(int n , String path) {
        if(n == 0) {
            System.out.println(path);
            return;
        }
        String s1 = path + "H";
        coinToss(n-1, s1);
        String s2 = path + "T";
        coinToss(n-1, s2);
    }


    // NO two consecutive Heads
     public static void coin(int n , String path) {
        if(n == 0){
            System.out.println(path);
            return;
        }
       if(path.length() == 0 || path.charAt(path.length() - 1) != 'H'){
           coin(n-1 , path + "H");
       }
       coin(n-1 , path + "T");
    }
    
}
