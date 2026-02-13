import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int m, int[][] arr) {
		int answer = Integer.MAX_VALUE;
		int[] dx = {1, 1, 1};
		int[] dy = {-1, 0, 1};
		
		Stack<int[]> s = new Stack<>();
		
		for (int i = 0; i < m; i++) {
			s.add(new int[] {0, i, arr[0][i], -1});
		}
		
		while(!s.isEmpty()) {
			int[] pop = s.pop();
			
			if (pop[0] == n-1) {
				if (answer > pop[2]) {
					answer = pop[2];
				}
				continue;
			}
			
			for (int i = 0; i < 3; i++) {
				if (i == pop[3]) {
					continue;
				}
				
				int x = pop[0] + dx[i];
				int y = pop[1] + dy[i];
				
				if (!(x < 0 || y < 0 || x >= n || y >= m)) {
					s.add(new int[] {x, y, pop[2]+arr[x][y], i});
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
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(solution(n, m, arr));
	}
}