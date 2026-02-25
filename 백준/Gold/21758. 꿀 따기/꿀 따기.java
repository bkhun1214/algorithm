import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int[] arr) {
		int answer = 0;
		
		int[] sumLeft = new int[n];
		sumLeft[n-1] = 0; // 맨 끝은 절대 포함 안됨 
		for (int i = n-2; i >= 0; i--) {
			sumLeft[i] = sumLeft[i+1] + arr[i];
		}
		
		int[] sumRight = new int[n];
		sumRight[0] = 0; // 맨 끝은 절대 포함 안됨
		for (int i = 1; i < n; i++) {
			sumRight[i] = sumRight[i-1] + arr[i];
		}
		
		// 왼쪽 끝이 벌통일 때
		for (int i = n-2; i > 0; i--) {
			int temp = sumLeft[i+1] + ((sumLeft[0] - sumLeft[i]) * 2);
			if (answer < temp) {
				answer = temp;
			}
		}
		
		// 오른쪽 끝이 벌통일 때
		for (int i = 1; i < n-1; i++) {
			int temp = sumRight[i-1] + ((sumRight[n-1] - sumRight[i]) * 2);
			if (answer < temp) {
				answer = temp;
			}
		}
		
		// 가운데 벌통일 때
		for (int i = 1; i < n-1; i++) {
			int temp = sumLeft[i] + sumRight[i];
			if (answer < temp) {
				answer = temp;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, arr));
	}
}