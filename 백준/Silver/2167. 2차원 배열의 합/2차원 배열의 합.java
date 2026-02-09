import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int[][] arr, int k, int[][] positions) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < k; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			
			int[] position = positions[i];
			int sum = 0;
			
			for (int x = position[0]; x <= position[2]; x++) {
				for (int y = position[1]; y <= position[3]; y++) {
					sum += arr[x][y];
				}
			}
			
			answer.append(sum);
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		
		int[][] position = new int[k][4];
		
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				position[i][j] = Integer.parseInt(st.nextToken()) - 1;
			}
		}
		
		System.out.println(solution(arr, k, position));
	}
}