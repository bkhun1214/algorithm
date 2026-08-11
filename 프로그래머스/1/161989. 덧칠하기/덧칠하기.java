import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        int temp = section[0];
        
        for (int s : section) {
            if (temp + m - 1 < s) {
                answer++;
                temp = s;
            }
        }
        
        return answer;
    }
}