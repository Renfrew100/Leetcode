import java.util.*;
import java.lang.*; 

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if (s == "(" || s == "[" || s == "{" || s == ")" || s == "]" || s =="}") {
                stack.push(c);
            }
            // If right symbol is encountered
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
            }
            // If none of the valid symbols is encountered
            else {
                return true;
            }
       }
        return stack.isEmpty();
    }
}