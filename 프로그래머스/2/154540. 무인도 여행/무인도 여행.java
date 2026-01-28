import java.util.*;
class Solution {
    public static int area = 0;
	
	public int[] solution(String[] maps) {
		
		int xLength = maps.length;
		int yLength = maps[0].length();
		char[][] map = new char[xLength][yLength];
		
		boolean[][] visited = new boolean[xLength][yLength];
        
        for (int i = 0; i < xLength; i++) {
			for (int j = 0; j < yLength; j++) {
				map[i][j] = maps[i].charAt(j);
			}
		}
		
		List<Integer> days = new ArrayList<>();
		
		for (int i = 0; i < xLength; i++) {
			for (int j = 0; j < yLength; j++) {
				if (map[i][j] != 'X' && !visited[i][j]) {
					search(map, visited, i, j);
					if (area != 0) {
						days.add(area);
					}
					area = 0;
				}
			}
		}
		int[] answer;
		if (days.size() == 0) {
			answer = new int[] {-1};
		} else {
			answer = new int[days.size()];
			
			days.sort(null);
			for (int i = 0; i < days.size(); i++) {
				answer[i] = days.get(i);
			}
		}
		
		return answer;
    }
	
	public void search(char[][] map, boolean[][] visited, int x, int y) {
		
		if (x < 0 || y < 0 || x >= map.length || y >= map[0].length) {
			return;
		}
		
		if (visited[x][y]) {
			return;
		}
		
		visited[x][y] = true;
		
		if (map[x][y] == 'X') {
			return;
		}
		
		area += (map[x][y] - '0');
		
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		
		for (int i = 0; i < 4; i++) {
			search(map, visited, x+dx[i], y+dy[i]);
		}
	}
}