import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int m, int[][] arr) {
		int answer = 0;
		
		boolean[] visited = new boolean[n+1];
		
		for (int i = 1; i < n+1; i++) {
			if (!visited[i]) {
				search(n, i, visited, arr);
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void search(int n, int x, boolean[] visited, int[][] arr) {
		if (visited[x]) {
			return;
		}
		visited[x] = true;
		for (int i = 1; i < n+1; i++) {
			if (arr[x][i] == 1) {
				search(n, i, visited, arr);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][n+1];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		System.out.println(solution(n, m, arr));
	}
}