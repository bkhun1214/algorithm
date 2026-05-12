import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        Arrays.sort(jobs, (s1, s2) -> {
        	return s1[0] - s2[0];
        });
        
        Queue<int[]> q = new PriorityQueue<>((s1, s2) -> {
        	// 작업번호, 요청시간, 소요시간
        	// 작업의 소요시간이 짧은 것, 작업의 요청 시각이 빠른 것, 작업의 번호가 작은 것 순
        	if (s1[2] == s2[2]) {
        		if (s1[1] == s2[1]) {
        			return s1[0] - s2[0];
        		}
        		return s1[1] - s2[1];
        	}
        	return s1[2] - s2[2];
        });
        
        int sum = 0;
        int num = jobs.length;
        int index = 0;
        int time = 0;
        
        while(index < num) {
        	while (index < num && jobs[index][0] <= time) {
        		q.add(new int[] {index, jobs[index][0], jobs[index][1]});
        		index++;
        	}
        	
        	if (q.isEmpty()) {
        		time++;
        		continue;
        	}
        	
        	int[] poll = q.poll();
        	time += poll[2];
        	sum += (time - poll[1]);
        }
        
        while (!q.isEmpty()) {
        	int[] poll = q.poll();
        	time += poll[2];
        	sum += (time - poll[1]);
        }
        
        answer = sum / num;
        
        return answer;
    }
}