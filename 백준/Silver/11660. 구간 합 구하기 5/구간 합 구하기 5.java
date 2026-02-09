import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int m, int[][] arr, int[][] inputs) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < m; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			
			int[] input = inputs[i];
			int sum = 0;
			
			for (int j = input[0]; j <= input[2]; j++) {
				
				if (input[1] > 0) {
					sum += arr[j][input[3]] - arr[j][input[1]-1];
				} else {
					sum += arr[j][input[3]];
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
		
		int[][] arr = new int[n][n];
		int[][] input = new int[m][4];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			for (int j = 1; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()) + arr[i][j-1];
			}
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				input[i][j] = Integer.parseInt(st.nextToken()) - 1;
			}
		}
		
		System.out.println(solution(m, arr, input));
	}
}