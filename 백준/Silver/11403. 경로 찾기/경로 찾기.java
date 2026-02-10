import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, int[][] arr) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			boolean[][] visited = new boolean[n][n];
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1) {
					search(i, i, j, arr, visited);
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j != 0) {
					answer.append(" ");
				}
				answer.append(arr[i][j]);
			}
			answer.append("\n");
		}
		
		return answer.toString();
	}
	
	public static void search(int i, int x, int y, int[][] arr, boolean[][] visited) {
		if (visited[x][y]) {
			return;
		}
		
		visited[x][y] = true;
		
		if (arr[x][y] == 0) {
			return;
		}
		
		if (arr[x][y] == 1) {
			arr[i][y] = 1;
		}
		
		for (int j = 0; j < arr.length; j++) {
			search(i, y, j, arr, visited);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(solution(n, arr));
	}
}