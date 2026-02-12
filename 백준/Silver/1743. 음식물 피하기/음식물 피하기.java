import java.util.*;
import java.io.*;

public class Main{
    static int num = 0;
	public static int solution(int n, int m, int[][] arr) {
		int answer = 0;
		
		boolean[][] visited = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && arr[i][j] == 1) {
					num = 0;
					search(i, j, arr, visited);
					if (answer < num) {
						answer = num;
					}
				}
			}
		}
		
		return answer;
	}
	
	public static void search(int x, int y, int[][] arr, boolean[][] visited) {
		int n = arr.length;
		int m = arr[0].length;
		
		if (x < 0 || y < 0 || x >= n || y >= m || visited[x][y] || arr[x][y] == 0) {
			return;
		}
		
		visited[x][y] = true;
		num++;
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		for (int i = 0; i < 4; i++) {
			search(x+dx[i], y+dy[i], arr, visited);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x-1][y-1] = 1;
		}
		
		System.out.println(solution(n, m, arr));
	}
}