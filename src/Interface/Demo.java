package Interface;


import java.util.HashMap;
import java.util.Map;


public class Demo{
    public static void main(String args[]){

        int i=7,j=6;
        try{
            int result=i/j;
            System.out.println(result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("I love you");
        }

        A obj = () ->System.out.println("in show");

        obj.Show();
        String text = "apple banana apple";
        String replaced = text.replaceAll("apple", "orange");
        System.out.println(replaced);
        String name = "Alice";
        int age = 30;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formatted);
        String[] splited= formatted.split(",");
        for (String a:splited)
        {
            System.out.println(a);
        }

        int[] nums= {2,7,11,15};
        int target= 9;
        Solution obj2= new Solution();
        int[] result=obj2.twoSum(nums,target);
        for (int n:result) {
            System.out.print(n);
        }

    }
}
@FunctionalInterface
interface A{
    void Show();

}

class ExceptionHandling{

    int i=7,j=0;
    void calculate() {
        try {
            int result = i / j;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


class Solution {


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            try {
                int complement = target - nums[i];
                if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                    return new int[]{i, numMap.get(complement)};
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

        return new int[]{}; // No solution found
    }
}


class AlphabetOccurrenceCounter {
    public static void main(String[] args) {
        String input = "hello world";

        int[] alphabetCount = new int[26]; // One index for each letter

        input = input.toLowerCase(); // Convert input to lowercase for case-insensitivity

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'a'; // Calculate the index for the letter
                alphabetCount[index]++;
            }
        }

        // Print the occurrences of each alphabet
        for (int i = 0; i < alphabetCount.length; i++) {
            if (alphabetCount[i] > 0) {
                char alphabet = (char) ('a' + i);
                System.out.print(alphabet + ": " + alphabetCount[i] + " ");
            }
        }
    }
}

