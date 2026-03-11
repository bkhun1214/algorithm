import java.util.*;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        
        int n = cards.length;
        boolean[] visited = new boolean[n];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
        	if (!visited[i]) {
        		int count = 1;
        		visited[i] = true;
        		int num = cards[i] - 1;
        		while (!visited[num]) {
        			count++;
        			visited[num] = true;
        			num = cards[num] - 1;
        		}
        		
        		list.add(count);
        	}
        }
        
        if (list.size() > 1) {
        	list.sort(Collections.reverseOrder());
        	
        	answer = list.get(0) * list.get(1);
        }
        
        return answer;
    }
}