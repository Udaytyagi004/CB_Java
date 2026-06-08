package Backtracking.Lec_36;

import java.util.Arrays;

public class PartitionArray {

    // place the last element such that all the smaller element than the last element are on the left of the last element and all the greater element are on the right side of it(array is not neccesarly to be sort)

    public static void main(String[] args) {
        int[] nums = {5 , 7 , 2 , 3 , 8 , 1 , 4};
        partition(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    public static void partition(int[] nums){
        int s = 0;
        int e = nums.length-1;

        for(int i = 0; i < e; i++) {
            if(nums[i] <= nums[e]) {
                swap(nums, s , i);
                s++;
            }
        }
        swap(nums , e , s);
    }
    private static void swap(int[] nums , int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}
