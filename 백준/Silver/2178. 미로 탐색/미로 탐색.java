import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int m, int[][] arr) {
		int answer = 0;
		
		boolean[][] visited = new boolean[n][m];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0, 0, 1});
		visited[0][0] = true;
		
		while(!q.isEmpty()) {
			
			int[] poll = q.poll();
			int x = poll[0];
			int y = poll[1];
			int num = poll[2];
			
			if (x == n-1 && y == m-1) {
				return num;
			}
			
			int[] dx = {-1, 1, 0, 0};
			int[] dy = {0, 0, -1, 1};
			
			for (int i = 0; i < 4; i++) {
				
				if (!(x+dx[i] < 0 || y+dy[i] < 0 || x+dx[i] >= n || y+dy[i] >= m) && (!visited[x+dx[i]][y+dy[i]]) && (arr[x+dx[i]][y+dy[i]] == 1)) {
					visited[x+dx[i]][y+dy[i]] = true;
					q.add(new int[] {x+dx[i], y+dy[i], num+1});
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
		
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < m; j++) {
				arr[i][j] = line.charAt(j) - '0';
			}
		}
		
		System.out.println(solution(n, m, arr));
	}
}