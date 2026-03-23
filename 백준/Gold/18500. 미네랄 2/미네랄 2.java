import java.io.*;
import java.util.*;

public class Main{
    public static String solution(int r, int c, char[][] arr, int n, int[] heights) {
		StringBuffer sb = new StringBuffer();
		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};
		
		for (int i = 0; i < n; i++) {
			int height = r - heights[i];
			boolean isBreak = false;
			int point = 0;
			if (i % 2 == 0) {
				// 왼쪽
				for (int j = 0; j < c; j++) {
					if (arr[height][j] == 'x') {
						isBreak = true;
						arr[height][j] = '.';
						point = j;
						break;
					}
				}
				
			} else {
				// 오른쪽
				for (int j = c-1; j >= 0; j--) {
					if (arr[height][j] == 'x') {
						isBreak = true;
						arr[height][j] = '.';
						point = j;
						break;
					}
				}
			}
			
			if (!isBreak) {
				continue;
			}
			
			// 공중에 떠있는지 확인
			boolean isAir = false;
			for (int j = 0; j < 4; j++) {
				int x = height+dx[j];
				int y = point+dy[j];
				
				if (x < 0 || y < 0 || x >= r || y >= c || arr[x][y] != 'x') {
					continue;
				}
				
				Queue<int[]> q = new LinkedList<>();
				boolean[][] visited = new boolean[r][c];
				List<int[]> list = new ArrayList<>();
				q.add(new int[] {height+dx[j], point+dy[j]});
				visited[height+dx[j]][point+dy[j]] = true;
				list.add(new int[] {height+dx[j], point+dy[j]});
				boolean isBottom = false;
				
				while(!q.isEmpty()) {
					int[] poll = q.poll();
					
					for (int k = 0; k < 4; k++) {
						x = poll[0] + dx[k];
						y = poll[1] + dy[k];
						
						if (x >= 0 && y >= 0 && x < r && y < c && !visited[x][y] && arr[x][y] == 'x') {
							if (x == r-1) {
								isBottom = true;
								break;
							}
							visited[x][y] = true;
							q.add(new int[] {x, y});
							list.add(new int[] {x, y});
						}
					}
					
					if (isBottom) {
						break;
					}
				}
				
				if (isBottom) {
					continue;
				}
				
				isAir = true;
				
				for (int k = 0; k < list.size(); k++) {
					// 공중 클러스터 . 변경
					int[] points = list.get(k);
					arr[points[0]][points[1]] = '.';
				}
				
				boolean isDown = true;
				while (isDown) {
					for (int k = 0; k < list.size(); k++) {
						int[] points = list.get(k);
						
						if (points[0] + 1 >= r || arr[points[0] + 1][points[1]] == 'x') {
							isDown = false;
							break;
						}
					}
					
					if (isDown) {
						for (int k = 0; k < list.size(); k++) {
							int[] points = list.get(k);
							points[0] += 1;
							list.set(k, points);
						}
					}
				}
				
				for (int k = 0; k < list.size(); k++) {
					int[] points = list.get(k);
					arr[points[0]][points[1]] = 'x';
				}
				
				if (isAir) {
					break;
				}
			}
		}
		
		
		for (int i = 0; i < r; i++) {
			if (i != 0) {
				sb.append("\n");
			}
			for (int j = 0; j < c; j++) {
				sb.append(arr[i][j]);
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[r][c];
		
		for (int i = 0; i < r; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < c; j++) {
				arr[i][j] = line.charAt(j);
			}
		}
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] height = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			height[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(r, c, arr, n, height));
	}
}