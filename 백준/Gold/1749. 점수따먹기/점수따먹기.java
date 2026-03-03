import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int m, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int sum = arr[i][j];
				
				if (i-1 >= 0) {
					sum+=arr[i-1][j];
				}
				
				if (j-1 >= 0) {
					sum+= arr[i][j-1];
				}
				
				if (i-1 >= 0 && j-1 >= 0) {
					sum-= arr[i-1][j-1];
				}
				
				arr[i][j] = sum;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k <= i; k++) {
					for (int l = 0; l <= j; l++) {
						int temp = arr[i][j];
						
						if (l-1 >= 0) {
							temp-= arr[i][l-1];
						}
						
						if (k-1 >= 0) {
							temp-= arr[k-1][j];
						}
						
						if (l-1 >= 0 && k-1 >= 0) {
							temp+= arr[k-1][l-1];
						}
						
						if (answer < temp) {
							answer = temp;
						}
					}
				}
			}
		}
		
		return answer;
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
		
		System.out.println(solution(n, m, arr));
	}
}