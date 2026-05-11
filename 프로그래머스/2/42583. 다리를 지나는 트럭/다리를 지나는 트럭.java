import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<int[]> q = new LinkedList<>();
        
        int truck = 0;
        int prev = 0;
        
        while (truck < truck_weights.length) {
        	answer++;
        	
        	if (q.size() > 0) {
        		int[] peek = q.peek();
        		if (answer >= peek[1]) {
        			prev -= peek[0];
        			q.poll();
        		}
        	}
        	
        	if (q.size() < bridge_length && truck_weights[truck] + prev <= weight) {
				prev += truck_weights[truck];
				q.add(new int[] {truck_weights[truck], answer+bridge_length});
				truck++;
        	}
        }
        
        while (!q.isEmpty()) {
    		int[] poll = q.poll();
    		answer = poll[1];
        }
        
        return answer;
    }
}