public class LongestValidParrentheses {
    public int longestValidParentheses(String s){
        char openingBracket = '(';
    
        char closingBracket = ')';

        int count = 0; 
        

            for(int i = 0; i < s.length(); i++){
                if(openingBracket == closingBracket){
                    count++;        
                }
        }   
        return count;
    }
}
