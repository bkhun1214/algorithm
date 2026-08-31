import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i<s.length(); i++) {
            char temp = s.charAt(i);
            if (map.containsKey(temp)) {
                int num = map.get(temp);
                answer[i] = i-num;
            } else {
                answer[i] = -1;
            }
            map.put(temp, i);
        }
        
        return answer;
    }
}