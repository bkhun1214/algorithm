import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (char c : s.toCharArray()) {
            for (int i = 0; i < index; i++) {
                c += 1;
                
                if (c > 'z') {
                    c -= 26;
                }
                
                while(skip.indexOf(c) != -1) {
                    c += 1;
                    if (c > 'z') {
                        c -= 26;
                    }
                }
                
            }
            
            answer += c;
        }
        
        return answer;
    }
}