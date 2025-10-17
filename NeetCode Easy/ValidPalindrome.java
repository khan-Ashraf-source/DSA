/*

Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

Example 2:

Input: s = "tab a cat"

Output: false
Explanation: "tabacat" is not a palindrome.

Constraints:

1 <= s.length <= 1000
s is made up of only printable ASCII characters.

*/

public class ValidPalindrome{
    public static boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while(i<j){
            char CI = s.charAt(i);
            char CJ = s.charAt(j);
            if(!Character.isLetterOrDigit(CI)){
                i++;
            }else if(!Character.isLetterOrDigit(CJ)){
                j--;
            }else if(Character.toLowerCase(CI) != Character.toLowerCase(CJ)){
                return false;
            }else{
                i++; j--;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "Was it a car or a cat I saw?";
        System.out.println("Input: s = '"+s.toString()+"'");
        System.out.println("Output: "+isPalindrome(s));
        s= "tab a cat";
        System.out.println("Input: s = '"+s.toString()+"'");
        System.out.println("Output: "+isPalindrome(s));
    }
}