package Leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisCheck {

    public static void main(String args[]) {


        Scanner obj = new Scanner(System.in);
        System.out.println(" enter the string");
        String s = obj.next();
        Solution obj2= new Solution();
        System.out.println(obj2.isValid(s));
    }
}


class Solution {
    public boolean isValid(String s) {

//copied code
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()
        ) {

            if(x=='('){

                stack.push(')');
            } else if (x=='{') {
                stack.push('}');

            } else if (x=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=x) {

                return false;
            }

        }


        return stack.isEmpty();
//My code
      /*  boolean result = false;
        for (int i = 0; i< s.length()-1;) {
            if (('(' == s.charAt(i) && ')' == s.charAt(i + 1)) || ('{' == s.charAt(i) && '}' == s.charAt(i + 1)) || ('[' == s.charAt(i) && ']' == s.charAt(i + 1))) {
                if (i == s.length() - 2)
                {result=true;
                    break;
                }
                else i = i + 2;
            }
        }


        return result;*/
    }
}
