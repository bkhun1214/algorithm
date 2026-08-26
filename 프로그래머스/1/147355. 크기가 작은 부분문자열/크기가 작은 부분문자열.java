import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        List<String> partList = new ArrayList<String>();
        int length = p.length();
        
        for (int i = 0; i < t.length() - length + 1; i++) {
            String sub = t.substring(i, i+length);
            partList.add(sub);
        }
        
        Long numberP = Long.parseLong(p);
        for (String part : partList) {
            Long temp = Long.parseLong(part);
            if (temp <= numberP) {
                answer++;
            }
        }
        return answer;
    }
}