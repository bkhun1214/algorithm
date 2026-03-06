import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = Integer.MAX_VALUE;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {y, 0});
        
        while (!q.isEmpty()) {
        	int[] poll = q.poll();
        	if (poll[0] == x) {
        		answer = poll[1];
        		break;
        	}
        	
        	if (poll[0] < x) {
        		continue;
        	}
        	
        	q.add(new int[] {poll[0] - n, poll[1]+1});
        	if (poll[0] % 2 == 0) q.add(new int[] {poll[0] / 2, poll[1]+1});
        	if (poll[0] % 3 == 0) q.add(new int[] {poll[0] / 3, poll[1]+1});
        }
        
        if (answer == Integer.MAX_VALUE) {
        	answer = -1;
        }
        
        return answer;
    }
}