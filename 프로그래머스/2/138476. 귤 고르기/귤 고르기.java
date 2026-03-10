import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
        	map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        
        list.sort((s1, s2) -> {
        	return map.get(s2) - map.get(s1);
        });
        
        for (int i = 0; i < map.size(); i++) {
        	k -= map.get(list.get(i));
        	answer++;
        	
        	if (k <= 0) {
        		break;
        	}
        }
        
        return answer;
    }
}