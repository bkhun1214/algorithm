import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int t, List<int[][]> list) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < t; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			int num = 0;
			
			int[][] arr = list.get(i);
			int m = arr.length;
			int n = arr[0].length;
			boolean[][] visited = new boolean[m][n];
			
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < n; k++) {
					if (!visited[j][k] && arr[j][k] == 1) {
						search(j, k, arr, visited);
						num++;
					}
				}
			}
			
			answer.append(num);
		}
		
		return answer.toString();
	}
	
	public static void search(int x, int y, int[][] arr, boolean[][] visited) {
		if (x < 0 || y < 0 || x >= arr.length || y >= arr[0].length) {
			return;
		}
		
		if (visited[x][y]) {
			return;
		}
		
		visited[x][y] = true;
		
		if (arr[x][y] == 0) {
			return;
		}
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		for (int i = 0; i < 4; i++) {
			search(x+dx[i], y+dy[i], arr, visited);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		List<int[][]> list = new ArrayList<>();
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[m][n];
			
			for (int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[x][y] = 1;
			}
			list.add(arr);
		}
		
		System.out.println(solution(t, list));
	}
}