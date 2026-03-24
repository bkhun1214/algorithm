import java.util.*;
import java.io.*;

public class Main{
    public static String solution(List<Integer> ns, List<int[][]> arrs) {
		StringBuffer sb = new StringBuffer();
		String answer = "Problem %d: %d";
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		for (int i = 0; i < ns.size(); i++) {
			int count = 0;
			int n = ns.get(i);
			int[][] arr = arrs.get(i);
			
			int[][] costs = new int[n][n];
			
			for (int j = 0; j < n; j++) {
				Arrays.fill(costs[j], Integer.MAX_VALUE);
			}
			
			Queue<int[]> q = new PriorityQueue<>((s1, s2) -> {return s1[2] - s2[2];});
			costs[0][0] = arr[0][0];
			q.add(new int[] {0, 0, costs[0][0]});
			
			while(!q.isEmpty()) {
				int[] poll = q.poll();
				
				if (costs[poll[0]][poll[1]] < poll[2]) {
					continue;
				}
				
				for (int j = 0; j < 4; j++) {
					int x = poll[0] + dx[j];
					int y = poll[1] + dy[j];
					
					if (x >= 0 && y >= 0 && x < n && y < n) {
						if (costs[x][y] > poll[2]+arr[x][y]) {
							costs[x][y] = poll[2]+arr[x][y];
							q.add(new int[] {x, y, costs[x][y]});
						}
					}
				}
			}
			
			count = costs[n-1][n-1];
			
			sb.append(String.format(answer, i+1, count));
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> ns = new ArrayList<>();
		List<int[][]> arrs = new ArrayList<>();
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			if (n == 0) {
				break;
			}
			
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			ns.add(n);
			arrs.add(arr);
		}
		
		System.out.println(solution(ns, arrs));
	}
}