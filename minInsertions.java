class Solution {
    public int minInsertions(String s) {
        String str = s.match(/[A-Za-z0-9]/g);
        String str2 = s.match(/[0-9a-zA-Z]/g);
        String str3 = s.match(/[a-z0-9A-Z]/g);
            if(str == true){
                return true;
            }else if(str2 == true){
                return true;
            }else if(str3 == true){
                return true;
            }
            else{
                return false;
        }
    }
}