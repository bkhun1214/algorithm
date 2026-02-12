import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int m, int[][] arr) {
		int answer = Integer.MAX_VALUE;
		
		boolean[][][] visited = new boolean[n][m][2];
		Queue<int[]> q = new LinkedList<>();
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		visited[0][0][0] = true;
		q.add(new int[]{0, 0, 1, 1});
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			if (poll[0] == n-1 && poll[1] == m-1) {
				if (answer > poll[2]) {
					answer = poll[2];
					continue;
				}
			}
			
			for (int i = 0; i < 4; i++) {
				int x = poll[0] + dx[i];
				int y = poll[1] + dy[i];
				
				if (!(x < 0 || y < 0 || x >= n || y >= m)) {
					
					if (arr[x][y] == 0 && poll[3] > 0 && !visited[x][y][0]) {
						visited[x][y][0] = true;
						q.add(new int[] {x, y, poll[2]+1, poll[3]});
					} else if (arr[x][y] == 0 && poll[3] == 0 && !visited[x][y][1]) {
						visited[x][y][1] = true;
						q.add(new int[] {x, y, poll[2]+1, poll[3]});
					} else if (arr[x][y] == 1 && poll[3] > 0 && !visited[x][y][1]){
						visited[x][y][1] = true;
						q.add(new int[] {x, y, poll[2]+1, poll[3]-1});
					}
				}
			}
		}
		
		if (answer == Integer.MAX_VALUE) {
			answer = -1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}
		
		
		System.out.println(solution(n, m, arr));
	}
}