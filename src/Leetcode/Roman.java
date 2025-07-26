package Leetcode;


import java.util.HashMap;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.*;

public class Roman {

    public static void main(String[] args) {
        HashMap<Character, Integer> romanToIntegerMap = new HashMap<>();
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");

        // Read the input as a string
        String s = scanner.nextLine();

        // Close the scanner to release resources (optional but recommended)
        scanner.close();
        int x= s.length();
        int[] arr = new int[x];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[i] = romanToIntegerMap.get(c);
        }
        int result= 0;
        for (int i = 0; i < x-1; i++){
            if(arr[i]>=arr[i+1])
                result=result+arr[i];
            else
                result=result-arr[i];

        }
        result=result+arr[x-1];
        System.out.println("the given numbers is: " + result);

    }

}
