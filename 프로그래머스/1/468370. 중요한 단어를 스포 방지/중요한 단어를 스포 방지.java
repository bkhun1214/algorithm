import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        List<String> spoiler = new ArrayList<>();
        
        int length = 0;
        int index = 0;
        String[] split = message.split(" ");
        
        
        for (int i = 0; i < split.length; i++) {
        	String word = split[i];
        	int start = length;
        	int end = length + word.length() - 1;
        	
        	while (spoiler_ranges.length - 1 > index && spoiler_ranges[index][1] < start) {
        		index++;
        	}
        	
        	if (end < spoiler_ranges[index][0]) {
        		map.put(word, map.getOrDefault(word, 0) + 1);
        	} else if (spoiler_ranges.length - 1 == index && spoiler_ranges[index][1] < start) {
        		map.put(word, map.getOrDefault(word, 0) + 1);
        	} else {
        		spoiler.add(word);
        	}
        	
        	length += word.length() + 1;
        }
        
        for (int j = 0; j < spoiler.size(); j++) {
        	String word = spoiler.get(j);
    		if (map.get(word) == null) {
    			answer++;
    			map.put(word, 1);
    		}
    	}
        
        return answer;
    }
}