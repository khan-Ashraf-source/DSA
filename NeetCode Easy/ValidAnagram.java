/*

Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.


*/

import java.util.*;
public class ValidAnagram{
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        String sortedS = new String(sChars);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);
        String sortedT = new String(tChars);
        boolean isAnagram = true;
        for(int i=0; i<s.length(); i++){
            if(sortedS.charAt(i) != sortedT.charAt(i)){
                isAnagram = false;
            }
        }
        return isAnagram;
    }
    public static void main(String[] args){
        String s= "racecar";
        String t= "carrace";
        System.out.println("Input s= '"+s.toString()+"', t='"+t.toString()+"'");
        System.out.println("Output: "+ isAnagram(s,t));
        s="jar"; t="jam";
        System.out.println("Input s= '"+s.toString()+"', t='"+t.toString()+"'");
        System.out.println("Output: "+ isAnagram(s,t));
    }
}