import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int k, int[] arr) {
		int answer = 0;
		
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		
		answer = sum;
		int lt = 0;
		int rt = k;
		
		for (int i = k; i < n; i++) {
			sum -= arr[lt];
			lt++;
			sum += arr[rt];
			rt++;
			
			if (answer < sum) {
				answer = sum;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, k, arr));
	}
}