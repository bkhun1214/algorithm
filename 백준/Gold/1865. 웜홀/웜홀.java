import java.util.*;
import java.io.*;

public class Main{
    public static String solution(List<Integer> ns, List<int[][]> arrs) {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < ns.size(); i++) {
			if (i != 0) {
				sb.append("\n");
			}
			int n = ns.get(i);
			
			int[][] arr = arrs.get(i);
			int[] cost = new int[n];
			Arrays.fill(cost, 1000000000);
			cost[0] = arr[0][0];
			
			for (int j = 0; j < n-1; j++) {
				boolean isChange = false;
				
				for (int k = 0; k < n; k++) {
					for (int l = 0; l < n; l++) {
						if (arr[k][l] != 0) {
							if (cost[k] + arr[k][l] < cost[l]) {
								cost[l] = cost[k] + arr[k][l];
								isChange = true;
							}
						}
					}
				}
				
				if (!isChange) {
					break;
				}
			}
			
			boolean isCycle = false;
			for (int k = 0; k < n; k++) {
				for (int l = 0; l < n; l++) {
					if (arr[k][l] != 0) {
						if (cost[k] + arr[k][l] < cost[l]) {
							isCycle = true;
							break;
						}
					}
				}
				if (isCycle) {
					break;
				}
			}
			
			if (isCycle) {
				sb.append("YES");
			} else {
				sb.append("NO");
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tc = Integer.parseInt(st.nextToken());
		
		List<Integer> ns = new ArrayList<>();
		List<int[][]> arrs = new ArrayList<>();
		
		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			ns.add(n);
			
			int[][] arr = new int[n][n];
			
			for (int j = 0; j < m; j++) {
				st = new StringTokenizer(br.readLine());
				int s = Integer.parseInt(st.nextToken()) - 1;
				int e = Integer.parseInt(st.nextToken()) - 1;
				int t = Integer.parseInt(st.nextToken());
				
				if (arr[s][e] != 0) {
					arr[s][e] = Math.min(t, arr[s][e]);
					arr[e][s] = Math.min(t, arr[e][s]);
				} else {
					arr[s][e] = t;
					arr[e][s] = t;
				}
			}
			
			for (int j = 0; j < w; j++) {
				st = new StringTokenizer(br.readLine());
				int s = Integer.parseInt(st.nextToken()) - 1;
				int e = Integer.parseInt(st.nextToken()) - 1;
				int t = Integer.parseInt(st.nextToken());
				
				arr[s][e] = -t;
			}
			
			arrs.add(arr);
		}
		
		System.out.println(solution(ns, arrs));
	}
}