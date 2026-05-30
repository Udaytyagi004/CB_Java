package Backtracking.Lec_32;

public class Main {
  public static void main(String[] args) {

  }
   public static void permutation(int[] boxes , int n , int j ,String path){
        if(j == n){
            System.out.println(path);
            return;
        }
        for(int i = 0; i < boxes.length; i++) {
            if(boxes[i] == 1) continue;
            boxes[i] = 1;
            permutation(boxes , n , j+1 , path + "b" + i + "q" + j);
            boxes[i] = 0;
        }
    }
    public static void combination(int[] boxes , int n , int j ,String path , int x){
        if(j == n){
            System.out.println(path);
            return;
        }
        for(int i = x+1; i < boxes.length; i++) {
            if(boxes[i] == 1) continue;
            boxes[i] = 1;
            combination(boxes , n , j+1 , path + "b" + i + "q" + j , i);
            boxes[i] = 0;
        }
    }
   
 
}
