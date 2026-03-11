import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
        	map.put(want[i], number[i]);
        }
        
        Map<String, Integer> buy = new HashMap<>();
        
        int lt = 0;
        
        for (int i = 0; i < discount.length; i++) {
        	buy.put(discount[i], buy.getOrDefault(discount[i], 0) + 1);
        	
        	if (map.get(discount[i]) == null) {
        		buy = new HashMap<>();
        		lt = i+1;
        		continue;
        	} else {
        		if (buy.get(discount[i]) < map.get(discount[i])) {
        			continue;
        		}
        		
        		while (buy.get(discount[i]) > map.get(discount[i]) && lt <= i) {
        			buy.put(discount[lt], buy.get(discount[lt]) - 1);
        			lt++;
        		}
        		
        		if (map.equals(buy)) {
        			answer++;
        			buy.put(discount[lt], buy.get(discount[lt]) - 1);
        			lt++;
        		}
        	}
        }
        
        
        return answer;
    }
}