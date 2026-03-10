import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>((s1, s2) -> {
        	return s2 - s1;
        });
        
        for (int i = 0; i < enemy.length; i++) {
        	n -= enemy[i];
        	q.add(enemy[i]);
        	
        	if (n < 0) {
        		
        		if (k > 0) {
        			k--;
        			n += q.poll();
        		} else {
        			break;
        		}
        	}
        	answer++;
        }
        
        return answer;
    }
}