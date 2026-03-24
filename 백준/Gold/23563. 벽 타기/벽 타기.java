import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int m, char[][] arr, int[] start, int[] end) {
		int answer = 0;
		
		int[][] costs = new int[n][m];
		for (int i = 0; i < n; i++) {
			Arrays.fill(costs[i], Integer.MAX_VALUE);
		}
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		Deque<int[]> q = new LinkedList<>();
		costs[start[0]][start[1]] = 0;
		q.add(new int[] {start[0], start[1], 0});
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			if (poll[0] == end[0] && poll[1] == end[1]) {
				answer = poll[2];
				break;
			}
			
			boolean isNearWall = false;
			
			// 내 주변 벽 확인
			for (int i = 0; i < 4; i++) {
				int x = poll[0] + dx[i];
				int y = poll[1] + dy[i];
				if (x >= 0 && y >= 0 && x < n && y < m) {
					if (arr[x][y] == '#') {
						isNearWall = true;
						break;
					}
				}
			}
			
			for (int i = 0; i < 4; i++) {
				int x = poll[0] + dx[i];
				int y = poll[1] + dy[i];
				if (x >= 0 && y >= 0 && x < n && y < m) {
					if (arr[x][y] != '#') {
						
						if (isNearWall) {
							
							// 다음 위치 주변 벽 확인
							boolean isNextNearWall = false;
							for (int j = 0; j < 4; j++) {
								int nextX = x + dx[j];
								int nextY = y + dy[j];
								if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m) {
									if (arr[nextX][nextY] == '#') {
										isNextNearWall = true;
										break;
									}
								}
							}
							
							if (isNextNearWall) {
								if (costs[x][y] > poll[2]) {
									costs[x][y] = poll[2];
									q.addFirst(new int[] {x, y, poll[2], 0});
								}
							} else {
								if (costs[x][y] > poll[2]+1) {
									costs[x][y] = poll[2]+1;
									q.addLast(new int[] {x, y, poll[2]+1, isNearWall ? 0 : 1});
								}
							}
						} else {
							if (costs[x][y] > poll[2]+1) {
								costs[x][y] = poll[2]+1;
								q.addLast(new int[] {x, y, poll[2]+1, isNearWall ? 0 : 1});
							}
						}
					}
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		char[][] arr = new char[n][m];
		int[] start = new int[2];
		int[] end = new int[2];
		
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			
			for (int j = 0; j < m; j++) {
				char c = line.charAt(j);
				
				if (c == 'S') {
					start[0] = i;
					start[1] = j;
				}
				
				if (c == 'E') {
					end[0] = i;
					end[1] = j;
				}
				arr[i][j] = c;
			}
		}
		
		System.out.println(solution(n, m, arr, start, end));
	}
}