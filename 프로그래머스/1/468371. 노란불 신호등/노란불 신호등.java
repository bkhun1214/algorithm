import java.util.*;

class Solution {
    public int solution(int[][] signals) {
        int answer = -1;
        
        int n = signals.length;
        int[] length = new int[n];
        List<Map<Integer, Integer>> list = new ArrayList<>();
        int max = 1;
        
        for (int i = 0; i < n; i++) {
        	int[] signal = signals[i];
        	length[i] = signal[0] + signal[1] + signal[2];
        	
        	max *= length[i];
        	
        	Map<Integer, Integer> map = new HashMap<>();
        	
        	for (int j = signal[0]+1; j <= signal[0]+signal[1]; j++) {
        		map.put(j, 1);
        	}
        	list.add(map);
        }
        
        
        for (int i = 1; i < max; i++) {
        	
        	boolean isYellow = true;
        	for (int j = 0; j < n; j++) {
        		int temp = i % length[j];
        		
        		Map<Integer, Integer> map = list.get(j);
        		if (map.get(temp) == null) {
        			isYellow = false;
        			break;
        		}
        	}
        	
        	if (isYellow) {
        		answer = i;
        		break;
        	}
        }
        
        return answer;
    }
}