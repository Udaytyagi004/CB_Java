package Recursion.Lec_31;
public class TOH {
    public static void main(String[] args) {
        toh(3 , "A" , "B" , "C");
    }
    public static void toh(int n , String src , String hlp , String dest) {
        if(n == 0) return;
        toh(n-1 , src , dest , hlp);
        System.out.println("Move " + n +"th" + " disk " + " => " + src + " to " + dest);
        toh(n-1 , hlp , src , dest);
        
    }
    
}
