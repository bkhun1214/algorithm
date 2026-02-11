import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int[] cal, int[][] arr) {
		boolean[] visited = new boolean[n+1];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{cal[0], 0});
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			visited[poll[0]] = true;
			
			if (poll[0] == cal[1]) {
				return poll[1];
			}
			
			for (int i = 1; i < n+1; i++) {
				if (arr[poll[0]][i] == 1 && !visited[i]) {
					q.add(new int[]{i, poll[1]+1});
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] cal = new int[2];
		cal[0] = Integer.parseInt(st.nextToken());
		cal[1] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][n+1];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		System.out.println(solution(n, cal, arr));
	}
}