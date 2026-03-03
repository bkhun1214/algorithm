import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        Arrays.sort(targets, (s1, s2) -> {
        	
        	if (s1[1] == s2[1]) {
        		return s1[0] - s2[0];
        	}
        	
        	return s1[1] - s2[1];
        });
        
        int point = 0;
        
        for (int i = 0; i < targets.length; i++) {
        	if (targets[i][0] >= point) {
        		point = targets[i][1];
        		answer++;
        	}
        }
        
        return answer;
    }
}