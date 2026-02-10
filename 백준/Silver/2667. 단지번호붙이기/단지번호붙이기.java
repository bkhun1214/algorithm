import java.util.*;
import java.io.*;

public class Main{
    static int num = 0;
	public static String solution(int n, int[][] arr) {
		StringBuffer answer = new StringBuffer();
		List<Integer> list = new ArrayList<>();
		
		boolean[][] visited = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j] && arr[i][j] == 1) {
					num = 0;
					search(i, j, arr, visited);
					
					list.add(num);
				}
			}
		}
		
		list.sort(null);
		answer.append(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			answer.append("\n");
			answer.append(list.get(i));
		}
		
		return answer.toString();
	}
	
	public static void search(int x, int y, int[][] arr, boolean[][] visited) {
		if (x < 0 || y < 0 || x >= arr.length || y >= arr.length) {
			return;
		}
		
		if (visited[x][y]) {
			return;
		}
		
		visited[x][y] = true;
		
		if (arr[x][y] == 0) {
			return;
		}
		
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
		
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}
		
		System.out.println(solution(n, arr));
	}
}