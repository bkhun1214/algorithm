import java.util.*;
import java.io.*;

public class Main{
    static int n;
	static int[][] arr;
	static boolean[][] visited;
	static int answer = Integer.MAX_VALUE;
	static int[] dx = {0, -1, 1, 0 ,0};
	static int[] dy = {0, 0, 0, -1, 1};
	
	public static void solution(int depth, int sum) {
		
		if (depth == 3) {
			if (answer > sum) {
				answer = sum;
			}
			return;
		} else {
			for (int i = 1; i < n-1; i++) {
				for (int j = 1; j < n-1; j++) {
					if (check(i, j)) {
						visit(i, j);
						solution(depth+1, sum+sum(i, j));
						visitCancel(i, j);
					}
				}
			}
		}
	}
	
	private static int sum(int x, int y) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += arr[x+dx[i]][y+dy[i]];
		}
		return sum;
	}
	
	private static void visitCancel(int x, int y) {
		for (int i = 0; i < 5; i++) {
			visited[x+dx[i]][y+dy[i]] = false;
		}
	}
	
	private static void visit(int x, int y) {
		for (int i = 0; i < 5; i++) {
			visited[x+dx[i]][y+dy[i]] = true;
		}
	}
	
	private static boolean check(int x, int y) {
		for (int i = 0; i < 5; i++) {
			if (visited[x+dx[i]][y+dy[i]]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		arr = new int[n][n];
		visited = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		solution(0, 0);
		System.out.println(answer);
	}
}