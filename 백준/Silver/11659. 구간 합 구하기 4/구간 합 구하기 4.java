import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int m, int[] arr, int[][] inputs) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < m; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			
			int[] input = inputs[i];
			int sum = 0;
			if (input[0] > 0) {
				sum = arr[input[1]] - arr[input[0]-1];
			} else {
				sum = arr[input[1]];
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
		
		int[] arr = new int[n];
		int[][] input = new int[m][2];
		
		st = new StringTokenizer(br.readLine());
		arr[0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			input[i][0] = Integer.parseInt(st.nextToken()) - 1;
			input[i][1] = Integer.parseInt(st.nextToken()) - 1;
		}
		
		System.out.println(solution(m, arr, input));
	}
}