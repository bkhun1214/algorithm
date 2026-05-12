import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] s = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
        	s[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(s, (s1, s2) -> {
        	return String.format("%s%s", s2, s1).compareTo(String.format("%s%s", s1, s2));
        });
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length; i++) {
        	sb.append(s[i]);
        }
        
        answer = sb.toString();
        
        if (answer.startsWith("0")) {
        	answer = "0";
        }
        
        return answer;
    }
}