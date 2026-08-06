import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for (String target : targets) {
            int result = -1;
            int sum = 0;
            for (char letter : target.toCharArray()) {
                int temp = 101;
                for (String key : keymap) {
                    int index = key.indexOf(letter) + 1;
                    if (index != 0 && temp > index) {
                        temp = index;
                    }
                }
                
                if (temp != 101) {
                    sum += temp;
                } else {
                    sum = 0;
                    break;
                }
            }
            
            if (sum != 0) {
                result = sum;
            }
            
            answer.add(result);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}