import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
       
          Deque<Character> arr
            = new ArrayDeque<Character>();
 
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i); 
            
            if(x == "{" || x == "(" || x == "["){
                arr.push(x);
            }
        }
        
        if(arr.isEmpty()){
            return false; 
        }
        
        char check;
        
        
        switch(s){
            case "}":
                check = arr.pop();
                if(check == "(" || check == "[")
                    return false;
            break;
            case ")":
                check = arr.pop();
                if(check == "{" || check == "[")
                    return false;
            break;
            case "]":
                if(check == "(" || check == "{")
                    return false; 
            break;
        }
            return arr.isEmpty();
    
    }
    
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String s = bufferedReader.readLine();

            String result = Result.isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
}
