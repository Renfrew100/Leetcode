import java.util.List;

public class GroupAnagrams {
    public List<String> groupAnagrams(String[] strs) {
        List<String> arrayStrs;
        List<String> arrayStrs2;
        List<String> arrayStrs3;
    
        for(int i=0; i < strs.length; i++){
            arrayStrs = arrayStrs2;
            arrayStrs2 = arrayStrs3;
            arrayStrs3 = arrayStrs;
            //arrayStrs.sort(arrayStrs2);
            //arrayStrs3.sort(arrayStrs2);
        }
     return arrayStrs;
    }
}
