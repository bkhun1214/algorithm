import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int k, int[] arr) {
		int answer = 0;
		
		for (int i = n-1; i >= 0; i--) {
			answer += k / arr[i];
			k = k % arr[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, k, arr));
	}
}