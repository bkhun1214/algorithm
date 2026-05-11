import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
        	list.add(priorities[i]);
        	q.add(new int[] {i, priorities[i]});
        }
        list.sort(Collections.reverseOrder());
        
        while (true) {
        	int[] poll = q.poll();
        	if (poll[1] < list.get(answer)) {
        		q.add(poll);
        		continue;
        	} else {
        		answer++;
        		if (location == poll[0]) {
        			break;
        		} else {
        			continue;
        		}
        	}
        }
        
        return answer;
    }
}