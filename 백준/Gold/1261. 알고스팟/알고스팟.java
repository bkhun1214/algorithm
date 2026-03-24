import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int m, int[][] arr) {
		int answer = 0;
		
		int[][] costs = new int[n][m];
		for (int i = 0; i < n; i++) {
			Arrays.fill(costs[i], Integer.MAX_VALUE);
		}
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		Deque<int[]> q = new LinkedList<>();
		q.add(new int[] {0, 0, 0});
		costs[0][0] = 0;
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			if (poll[0] == n-1 && poll[1] == m-1) {
				answer = poll[2];
				break;
			}
			
			for (int i = 0; i < 4; i++) {
				int x = poll[0] + dx[i];
				int y = poll[1] + dy[i];
				
				if (x >= 0 && y >= 0 && x < n && y < m) {
					if (arr[x][y] == 0) {
						if (costs[x][y] > poll[2]) {
							costs[x][y] = poll[2];
							q.addFirst(new int[] {x, y, poll[2]});
						}
					}
					
					if (arr[x][y] == 1) {
						if (costs[x][y] > poll[2]+1) {
							costs[x][y] = poll[2]+1;
							q.addLast(new int[] {x, y, poll[2]+1});
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
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				char c = line.charAt(j);
				
				arr[i][j] = c - '0';
			}
		}
		
		System.out.println(solution(n, m, arr));
	}
}