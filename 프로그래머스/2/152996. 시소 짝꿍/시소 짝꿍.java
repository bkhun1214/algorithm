import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Double, Long> map = new HashMap<>();
        int length = weights.length;
        
        for (int i = 0; i < length; i++) {
        	map.put(weights[i]*1.0, map.getOrDefault(weights[i]*1.0, 0L) + 1);
        }
        
        for (int i = 0; i < length; i++) {
        	// 2m
        	double two = (weights[i] * 2) * 1.0;
        	answer += map.getOrDefault(two/3.0, 0L);
        	answer += map.getOrDefault(two/4.0, 0L);
        	
        	// 3m
        	double three = (weights[i] * 3) * 1.0;
        	answer += map.getOrDefault(three/2.0, 0L);
        	answer += map.getOrDefault(three/4.0, 0L);
        	
        	// 4m
        	double four = (weights[i] * 4) * 1.0;
        	answer += map.getOrDefault(four/2.0, 0L);
        	answer += map.getOrDefault(four/3.0, 0L);
        }
        
        for (double i : map.keySet()) {
        	if (map.get(i) > 1) {
        		answer += map.get(i) * (map.get(i) - 1);
        	}
        }
        
        answer = answer/2;
        
        return answer;
    }
}