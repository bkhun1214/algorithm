import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, int m, int[][] arr) {
		StringBuffer sb = new StringBuffer();
		
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append("\n");
			}
			for (int j = 0; j < n; j++) {
				if (j != 0) {
					sb.append(" ");
				}
				
				if (arr[i][j] == 1000000000) {
					sb.append(0);
				} else {
					sb.append(arr[i][j]);
				}
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(arr[i], 1000000000);
			arr[i][i] = 0;
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken()) - 1;
			int e = Integer.parseInt(st.nextToken()) - 1;
			int v = Integer.parseInt(st.nextToken());
			
			arr[s][e] = Math.min(v, arr[s][e]);
		}
		
		System.out.println(solution(n, m, arr));
	}
}