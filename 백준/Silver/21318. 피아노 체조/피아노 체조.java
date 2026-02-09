import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int[] arr, int q, int[][] questions) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < q; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			
			int sum = 0;
			int[] question = questions[i];
			
			sum += arr[question[1] - 1] - arr[question[0] - 1];
			
			answer.append(sum);
		}

		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		int prev = Integer.parseInt(st.nextToken());
		for (int i = 1; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arr[i] = (prev > temp ? 1 : 0) + arr[i-1];
			prev = temp;
		}
		
		st = new StringTokenizer(br.readLine());
		int q = Integer.parseInt(st.nextToken());
		
		int[][] question = new int[q][2];
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			question[i][0] = Integer.parseInt(st.nextToken());
			question[i][1] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(arr, q, question));
	}
}