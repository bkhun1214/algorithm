import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        
        Map<String, Integer> sum = new HashMap<>();
        Map<String, Map<Integer, Integer>> music = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
        	String genre = genres[i];
        	int play = plays[i];
        	
        	if (sum.get(genre) == null) {
        		sum.put(genre, play);
        		Map<Integer, Integer> map = new HashMap<>();
        		map.put(i, play);
        		music.put(genre, map);
        	} else {
        		sum.put(genre, sum.get(genre) + play);
        		Map<Integer, Integer> map = music.get(genre);
        		map.put(i, play);
        		music.put(genre, map);
        	}
        }
        
        List<String> list = new ArrayList<>(sum.keySet());
    	list.sort((s1, s2) -> {
    		return sum.get(s2) - sum.get(s1);
    	});
    	
    	for (int i = 0; i < list.size(); i++) {
    		String genre = list.get(i);
    		
    		Map<Integer, Integer> map = music.get(genre);
    		List<Integer> temp = new ArrayList<>(map.keySet());
    		temp.sort((s1, s2) -> {
    			if (map.get(s1) == map.get(s2)) {
    				return s1-s2;
    			}
    			return map.get(s2) - map.get(s1);
    		});
    		
    		answerList.add(temp.get(0));
    		
    		if (temp.size() > 1) {
    			answerList.add(temp.get(1));
    		}
    	}
    	
    	answer = new int[answerList.size()];
    	
    	for (int i = 0; i < answerList.size(); i++) {
    		answer[i] = answerList.get(i);
    	}
        
        return answer;
    }
}