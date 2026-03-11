import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long sum1 = 0;
        long sum2 = 0;
        
        for (int i = 0; i < queue1.length; i++) {
        	int temp = queue1[i];
        	sum1 += temp;
        	q1.add(temp);
        }
        
        for (int i = 0; i < queue2.length; i++) {
        	int temp = queue2[i];
        	sum2 += temp;
        	q2.add(temp);
        }
        
        long sum = (sum1+sum2) / 2;
        
        Queue<long[]> q = new LinkedList<>();
        q.add(new long[] {sum1, sum2, 0});
        
        while (!q.isEmpty()) {
        	long[] poll = q.poll();
        	if (poll[0] == sum) {
        		answer = (int) poll[2];
        		break;
        	}
        	
        	if (q1.isEmpty() || q2.isEmpty() || poll[2] > (queue1.length+queue2.length) * 2) {
        		answer = -1;
        		break;
        	}
        	
        	if (poll[0] > poll[1]) {
        		int temp = q1.poll();
        		q2.add(temp);
        		q.add(new long[] {poll[0]-temp, poll[1]+temp, poll[2]+1});
        	} else {
        		int temp = q2.poll();
        		q1.add(temp);
        		q.add(new long[] {poll[0]+temp, poll[1]-temp, poll[2]+1});
        	}
        }
        
        return answer;
    }
}