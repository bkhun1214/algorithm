import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<int[]> q = new PriorityQueue<>((s1, s2) -> {
        	return s2[1] - s1[1];
        });
        
        for (int i = 0; i < prices.length; i++) {
        	int price = prices[i];
        	
    		while(!q.isEmpty() && price < q.peek()[1]) {
    			int[] poll = q.poll();
    			answer[poll[0]] = i - poll[0];
    		}
        		
        	q.add(new int[] {i, price});
        }
        
        while(!q.isEmpty()) {
			int[] poll = q.poll();
			answer[poll[0]] = (prices.length-1) - poll[0];
		}
        
        return answer;
    }
}