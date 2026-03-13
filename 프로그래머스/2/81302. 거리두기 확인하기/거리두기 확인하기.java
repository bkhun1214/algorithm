import java.util.*;

class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1 ,1};
        
        for (int i = 0; i < places.length; i++) {
        	
        	String[] place = places[i];
        	
        	boolean b = true;
        	for (int j = 0; j < 5; j++) {
        		for (int k = 0; k < 5; k++) {
        			
        			if (place[j].charAt(k) == 'P') {
        				boolean[][] visited = new boolean[5][5];
        				Queue<int[]> q = new LinkedList<>();
        				visited[j][k] = true;
        				q.add(new int[] {j, k, 0});
        				
        				while(!q.isEmpty()) {
        					int[] poll = q.poll();
        					
        					if (poll[2] == 2) {
        						continue;
        					}
        					
        					for (int l = 0; l < 4; l++) {
        						int x = poll[0] + dx[l];
        						int y = poll[1] + dy[l];
        						if (x >= 0 && y >= 0 && x < 5 && y < 5 && !visited[x][y]) {
        							char c = place[x].charAt(y);
        							if (c == 'X') {
        								visited[x][y] = true;
        								continue;
        							} else if (c == 'P') {
        								b = false;
        								break;
        							} else {
        								q.add(new int[] {x, y, poll[2]+1});
        							}
        						}
        					}
        					if (!b) {
        						break;
        					}
        				}
        			}
        			if (!b) {
            			break;
            		}
        		}
        		if (!b) {
        			break;
        		}
        	}
        	if (b) {
        		answer[i] = 1;
        	} else {
        		answer[i] = 0;
        	}
        }
        
        return answer;
    }
}