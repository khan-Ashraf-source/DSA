/*

You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise.

Example 1:

Input: s = "[]"

Output: true
Example 2:

Input: s = "([{}])"

Output: true
Example 3:

Input: s = "[(])"

Output: false
Explanation: The brackets are not closed in the correct order.

Constraints:

1 <= s.length <= 1000

*/
import java.util.*;
public class ValidParentheses{
    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stk.push(s.charAt(i));
            }else{
                if(stk.size() == 0){
                    return false;
                }
                if((s.charAt(i) == ')' && stk.peek() == '(') || (s.charAt(i) == '}' && stk.peek() == '{') || (s.charAt(i) == ']' && stk.peek() == '[')){
                    stk.pop();
                }else{
                    return false;
                }
            }
        }   
        if(stk.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        String s = "[]";
        System.out.println("Input: s = '"+s.toString()+"'");
        System.out.println("Output: "+ isValid(s));
        s= "([{}])";
        System.out.println("Input: s = '"+s.toString()+"'");
        System.out.println("Output: "+ isValid(s));
        s= "[(])";
        System.out.println("Input: s = '"+s.toString()+"'");
        System.out.println("Output: "+ isValid(s));
    }
}