import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>((s1, s2) -> {
        	return s1 - s2;
        });
        
        for (int i = 0; i < scoville.length; i++) {
        	q.add(scoville[i]);
        }
        
        while (q.size() > 1) {
        	if (q.peek() >= K) {
        		break;
        	}
        	answer++;
        	
        	int num1 = q.poll();
        	int num2 = q.poll();
        	q.add(num1+(num2*2));
        }
        
        if (q.peek() < K) {
        	answer = -1;
        }
        
        return answer;
    }
}