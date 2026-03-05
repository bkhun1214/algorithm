import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = Integer.MAX_VALUE;
        int length = minerals.length;
        int[][] count = {{1, 1, 1}, {5, 1, 1}, {25, 5, 1}};
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {picks[0], picks[1], picks[2], 0, 0});
        
        while (!q.isEmpty()) {
        	int[] poll = q.poll();
        	
        	if ((poll[0] == 0 && poll[1] == 0 && poll[2] == 0) || poll[3] >= length) {
        		if (poll[4] < answer) {
        			answer = poll[4];
        		}
        		continue;
        	}
        	
        	for (int i = 0; i < 3; i++) {
        		if (poll[i] > 0) {
        			int index = poll[3];
                	int num = poll[4];
                	
                	for (int j = 0; j < 5; j++) {
                		if (minerals[index].equals("diamond")) {
                			num += count[i][0];
                		} else if (minerals[index].equals("iron")) {
                			num += count[i][1];
                		} else {
                			num += count[i][2];
                		}
                		
                		index++;
                		
                		if (index >= length) {
                			if (num < answer) {
                				answer = num;
                			}
                			
                			break;
                		}
                	}
                	
                	if (i == 0) q.add(new int[] {poll[0]-1, poll[1], poll[2], index, num});
                	if (i == 1) q.add(new int[] {poll[0], poll[1]-1, poll[2], index, num});
                	if (i == 2) q.add(new int[] {poll[0], poll[1], poll[2]-1, index, num});
        		}
        	}
        }
        
        return answer;
    }
}