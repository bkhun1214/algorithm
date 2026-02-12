import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int m, int[][] arr, List<int[]> list) {
		int answer = 0;
		
		if (list.size() == 0) {
			return -1;
		}
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		boolean[][] visited = new boolean[n][m];
		Queue<int[]> q = new LinkedList<>();
		for (int[] a : list) {
			int x = a[0];
			int y = a[1];
			visited[x][y] = true;
			q.add(new int[] {x, y, 0});
		}
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			if (arr[poll[0]][poll[1]] == 0 || poll[2] < arr[poll[0]][poll[1]]) {
				arr[poll[0]][poll[1]] = poll[2];
			}
			
			for (int i = 0 ; i < 4; i++) {
				int x1 = poll[0]+dx[i];
				int y1 = poll[1]+dy[i];
				
				if (!(x1 < 0 || y1 < 0 || x1 >=n || y1 >= m) && !visited[x1][y1] && arr[x1][y1] != -1) {
					visited[x1][y1] = true;
					q.add(new int[] {x1, y1, poll[2]+1});
				}
			}
		}
		
		for (int[] a : list) {
			int x = a[0];
			int y = a[1];
			arr[x][y] = 1;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int temp = arr[i][j];
				
				if (temp == -1) {
					continue;
				} else if (temp == 0) {
					return -1;
				} else {
					
					if (answer < temp) {
						answer = temp;
					}
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		List<int[]> list = new ArrayList<>();
		boolean isZero = false;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int x = Integer.parseInt(st.nextToken());
				if (x == 1) {
					list.add(new int[] {i, j});
				} else if (!isZero && x == 0) {
					isZero = true;
				}
				arr[i][j] = x;
			}
		}
		
		if (isZero) {
			System.out.println(solution(n, m, arr, list));
		} else {
			System.out.println("0");
		}
	}
}