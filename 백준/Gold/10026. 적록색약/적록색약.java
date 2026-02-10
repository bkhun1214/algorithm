import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, char[][] arr) {
		StringBuffer answer = new StringBuffer();
		
		int area1 = 0;
		int area2 = 0;
		
		boolean[][] visited1 = new boolean[n][n];
		boolean[][] visited2 = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited1[i][j]) {
					search1(i, j, arr, visited1, arr[i][j]);
					area1++;
				}
				
				if (!visited2[i][j]) {
					search2(i, j, arr, visited2, arr[i][j]);
					area2++;
				}
			}
		}
		
		answer.append(area1);
		answer.append(" ");
		answer.append(area2);
		
		return answer.toString();
	}
	
	public static void search1(int x, int y, char[][] arr, boolean[][] visited, char c) {
		if (x < 0 || y < 0 || x >= arr.length || y >= arr[0].length) {
			return;
		}
		
		if (arr[x][y] != c) {
			return;
		}
		
		if (visited[x][y]) {
			return;
		}
		
		visited[x][y] = true;
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		for (int i = 0; i < 4; i++) {
			search1(x+dx[i], y+dy[i], arr, visited, c);
		}
	}
	
	public static void search2(int x, int y, char[][] arr, boolean[][] visited, char c) {
		if (x < 0 || y < 0 || x >= arr.length || y >= arr[0].length) {
			return;
		}
		
		if (c == 'B' && arr[x][y] != 'B') {
			return;
		} else if(c != 'B' && arr[x][y] == 'B') {
			return;
		}
		
		if (visited[x][y]) {
			return;
		}
		
		visited[x][y] = true;
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		for (int i = 0; i < 4; i++) {
			search2(x+dx[i], y+dy[i], arr, visited, c);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < n; j++) {
				arr[i][j] = line.charAt(j);
			}
		}
		
		System.out.println(solution(n, arr));
	}
}