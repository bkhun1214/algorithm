import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, int[][] arr) {
		StringBuffer sb = new StringBuffer();
		
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					
					if (arr[i][k] == 1 && arr[k][j] == 1) {
						arr[i][j] = 1;
					}
					
					if (arr[i][k] == -1 && arr[k][j] == -1) {
						arr[i][j] = -1;
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append("\n");
			}
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (i != j && arr[i][j] == 0) {
					count++;
				}
			}
			sb.append(count);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][n];
		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			
			arr[x][y] = 1;
			arr[y][x] = -1;
		}
		
		System.out.println(solution(n, arr));
	}
}