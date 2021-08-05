class validAnagram{
    public boolean isAnagram(String s, String t){
        while((s.length() == t.length()) && (s.toLowerCase().contains(t.toLowerCase()))){
            return true;
        }
    return false;
    }   
}

 
