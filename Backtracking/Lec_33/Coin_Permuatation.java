package Backtracking.Lec_33;


// Ques given a coin array , infinite supply of each coin , find permutation of coins whose sum is equal to a target
public class Coin_Permuatation {
    public static void main(String[] args) {
        
    }


    // permutation 

    public static void coin_per(int[] coins , int target , String path) {
        if(target == 0) {
            System.out.println(path);
            return;
        }

        for(int i = 0; i < coins.length; i++) {
            if(target >= coins[i]) {
                coin_per(coins, target - coins[i] , path  coins[i]);
            }
        }
    }


    // combination 
    public static void coin_comb(int[] coins , int target , String path , int j) {
        if(target == 0) {
            System.out.println(path);
            return;
        }
        if(target < 0) return;
        
        for(int i = j; i < coins.length; i++) {
            coin_comb(coins , target - coins[i] , path + coins[i] , i);
        }
    }

    
}
