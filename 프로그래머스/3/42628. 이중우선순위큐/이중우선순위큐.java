import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        TreeMap<Integer, Integer> map = new TreeMap<>((s1, s2) -> {
        	return s1-s2;
        });
        
        for (int i = 0; i < operations.length; i++) {
        	String[] s = operations[i].split(" ");
        	
        	if (s[0].equals("I")) {
        		int num = Integer.parseInt(s[1]);
        		map.put(num, map.getOrDefault(num, 0) + 1);
        	} else if (!map.isEmpty()) {
        		int num = 0;
        		if(s[1].equals("1")) {
        			num = map.lastKey();
        		} else {
        			num = map.firstKey();
        		}
        		if (map.get(num) == 1) {
    				map.remove(num);
    			} else {
    				map.put(num, map.get(num) - 1);
    			}
        	}
        }
        
        if (map.isEmpty()) {
        	answer[0] = 0;
        	answer[1] = 0;
        } else {
        	answer[0] = map.lastKey();
        	answer[1] = map.firstKey();
        }
        
        return answer;
    }
}