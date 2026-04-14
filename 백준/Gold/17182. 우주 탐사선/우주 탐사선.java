import java.util.*;
import java.io.*;

public class Main{
    static int sum = Integer.MAX_VALUE;
	static boolean[] visited;
	
	public static int solution(int n, int k, int[][] arr) {
		int answer = 0;
		
		for (int l = 0; l < n; l++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j) {
						continue;
					}
					if (arr[i][j] > arr[i][l] + arr[l][j]) {
						arr[i][j] = arr[i][l] + arr[l][j];
					}
				}
			}
		}
		
		sum = Integer.MAX_VALUE;
		visited = new boolean[n];
		visited[k] = true;
		
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				search(n, 1, i, arr[k][i], arr);
				visited[i] = false;
			}
		}
		
		answer = sum;
		
		return answer;
	}
	
	public static void search(int n, int depth, int num, int total, int[][] arr) {
		if (depth == n-1) {
			if (sum > total) {
				sum = total;
				return;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				search(n, depth+1, i, total+arr[num][i], arr);
				visited[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(solution(n, k, arr));
	}
}