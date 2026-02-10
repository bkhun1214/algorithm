import java.util.*;
import java.io.*;

public class Main{
    static int num = 0;
	public static String solution(int m, int n, int[][] arr) {
		StringBuffer answer = new StringBuffer();
		
		boolean[][] visited = new boolean[m][n];
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j] && arr[i][j] == 0) {
					num = 0;
					search(i, j, arr, visited);
					
					list.add(num);
				}
			}
		}
		
		list.sort(null);
		
		answer.append(list.size());
		answer.append("\n");
		
		for (int i = 0; i < list.size(); i++) {
			if (i != 0) {
				answer.append(" ");
			}
			answer.append(list.get(i));
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
		
		if (arr[x][y] == 1) {
			return;
		}
		
		num++;
		
		int[] dx = {-1, 1, 0 ,0};
		int[] dy = {0, 0, -1, 1};
		
		for (int i = 0; i < 4; i++) {
			search(x+dx[i], y+dy[i], arr, visited);
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[m][n];
		
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for (int j = x1; j < x2; j++) {
				for (int l = y1; l < y2; l++) {
					arr[l][j] = 1;
				}
			}
		}
		
		System.out.println(solution(m, n, arr));
	}
}