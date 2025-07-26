package Leetcode;

import java.util.Scanner;

public class MaxProfit {

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("please enter the length of the array");
        int x = obj.nextInt();
        System.out.println("please enter the stock price");
        int[] prices = new int[x];
        for(int i = 0; i < x; i++)
          prices[i] = obj.nextInt();
        Solution2 obj2= new Solution2();
        System.out.println(obj2.maxProfit(prices));


    }
}

class Solution2 {
    public int maxProfit(int[] prices) {

        {
            int lsf = Integer.MAX_VALUE; // least so far
            int op = 0; // overall profit
            int pist = 0; // profit if sold today

            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < lsf) { // if we found new buy value which is more smaller then previous one
                    lsf = prices[i]; // update our least so far
                }
                pist = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
                if (op < pist) { // if pist is more then our previous overall profit
                    op = pist; // update overall profit
                }
            }
            return op; // return op

     /*   int result=0;
        for(int i=0; i< prices.length-1; i++ ){
            for(int j = i+1; j<prices.length; j++){
                int x =prices[j]-prices[i];
                if(prices[j]>prices[i] && result<x)
                    result=x;
            }

        }
        return result;*/

        }
    }
}
