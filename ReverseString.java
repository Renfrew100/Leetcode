import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.length;
import java.util.StringBuilder;
import java.util.String;
import java .util.charAt;


class ReverseString{
    public void reverseString(char[] s){
           List<String> words = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < n;) {
            while (i < n && s.charAt(i) == ' ') {
                ++i;
            }
            if (i < n) {
                StringBuilder t = new StringBuilder();
                int j = i;
                while (j < n && s.charAt(j) != ' ') {
                    t.append(s.charAt(j++));
                }
                words.add(t.toString());
                i = j;
            }
        }
        Collections.reverse(words);
        return String.join(" ", words);
    }
}