import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int k, int[] arr) {
		int answer = 0;
		
		if (n <= k) {
			return answer;
		}
		
		Arrays.sort(arr);
		
		int[] dt = new int[n-1];
		
		for (int i = 0; i < n-1; i++) {
			dt[i] = arr[i+1] - arr[i];
		}
		
		Arrays.sort(dt);
		
		for (int i = 0; i < n-k; i++) {
			answer += dt[i];
		}
		
		return answer;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, k, arr));
	}
}