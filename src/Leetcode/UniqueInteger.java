package Leetcode;

import java.util.Scanner;

public class UniqueInteger {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int[] nums = new int[x];
        for(int i=0; i<x;i++)
            nums[i]= obj.nextInt();

            /*if (nums.length == 0) {
                return 0;
            }*/

            int i = 0; // Pointer for unique elements
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    // Found a new unique element
                    i++;
                    nums[i] = nums[j];
                }
            }

        System.out.println( i + 1);


    }
}
