import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        int count = 0;
        
        while (count < progresses.length) {
        	for (int i = 0; i < progresses.length; i++) {
        		progresses[i] += speeds[i];
        	}
        	
    		int temp = 0;
    		while (count < progresses.length && progresses[count] >= 100) {
    			temp++;
    			count++;
    		}
    		
    		if (temp > 0) {
    			list.add(temp);
    		}
        }
        
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}