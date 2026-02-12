import java.util.*;
import java.io.*;

public class Main{
    public static String solution(char[][] arr, List<int[]> water, int[] move) {
		int n = arr.length;
		int m = arr[0].length;
		boolean[][] visited = new boolean[n][m];
		Queue<int[]> q = new LinkedList<>();
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		for (int[] a : water) {
			visited[a[0]][a[1]] = true;
			q.add(new int[] {a[0], a[1], 0});
		}
		
		visited[move[0]][move[1]] = true;
		q.add(new int[] {move[0], move[1], 0});
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			char c = arr[poll[0]][poll[1]];
			
			if (c == '*') {
				for (int i = 0; i < 4; i++) {
					int x = poll[0] + dx[i];
					int y = poll[1] + dy[i];
					
					if (!(x < 0 || y < 0 || x >= n || y >= m) && (!visited[x][y]) && (arr[x][y] == '.')) {
						visited[x][y] = true;
						arr[x][y] = '*';
						q.add(new int[] {x, y, 0});
					}
				}
			} else {
				
				if (c == 'D') {
					return String.valueOf(poll[2]);
				}
				
				for (int i = 0; i < 4; i++) {
					int x = poll[0] + dx[i];
					int y = poll[1] + dy[i];
					
					if (!(x < 0 || y < 0 || x >= n || y >= m) && (!visited[x][y]) && (arr[x][y] == '.' || arr[x][y] == 'D')) {
						visited[x][y] = true;
						q.add(new int[] {x, y, poll[2]+1});
					}
				}
			}
		}
		
		return "KAKTUS";
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[r][c];
		List<int[]> water = new ArrayList<>();
		
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		
		for (int i = 0; i < r; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < c; j++) {
				char s = line.charAt(j);
				if (s == 'S') {
					x1 = i;
					y1 = j;
				} else if (s == 'D') {
					x2 = i;
					y2 = j;
				} else if (s == '*') {
					water.add(new int[] {i, j});
				}
				arr[i][j] = s;
			}
		}
		int[] move = {x1, y1, x2, y2};
		
		System.out.println(solution(arr, water, move));
	}
}