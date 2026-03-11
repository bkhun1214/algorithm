import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        HashSet<Integer> left = new HashSet<>();
        HashSet<Integer> right = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < topping.length; i++) {
        	right.add(topping[i]);
        	map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
        }
        
        for (int i = 0; i < topping.length-1; i++) {
        	left.add(topping[i]);
        	
        	int temp = map.get(topping[i]);
        	if (temp > 1) {
        		map.put(topping[i], temp-1);
        	} else {
        		right.remove(topping[i]);
        	}
        	
        	if (left.size() == right.size()) {
        		answer++;
        	} else if (left.size() > right.size()) {
        		break;
        	}
        }
        
        return answer;
    }
}