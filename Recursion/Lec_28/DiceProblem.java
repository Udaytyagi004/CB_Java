// problem Statement 
// Given a dice with faces 1,2,3, ... , you can roll the dice as many time as you want , there is a target n , print all the possible paths to reach the target(combinations of the dice faces that sums equal to target)


public package Recursion.Lec_28;

class DiceProblem {

    public static void main(String[] args) {
        allPaths(4, 0, "");
    }
    public static void allPaths(int target , int curr , String path) {
        if(curr == target) {
            System.out.println(path);
            return;
        }
        if(curr > target){
            return;
        }
        for(int i = 1; i <= 6; i++) {
            allPaths(target, curr+i, path+i);
        }
    }
}