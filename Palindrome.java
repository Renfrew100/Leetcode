class Solution {
    public boolean isPalindrome(String s) {
        String str = s.match(/[A-Za-z0-9]/g);
            if(str == null){
                return true;
            }else{
                return false;
        }
    }
}