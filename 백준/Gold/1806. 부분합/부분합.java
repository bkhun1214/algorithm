import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int s, int[] arr) {
		int answer = Integer.MAX_VALUE;
		
		int length = 0;
		int lt = 0;
		int sum = 0;
		
		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			if (sum >= s) {
				length = rt - lt + 1;
				if (answer > length) {
					answer = length;
				}
			}
			
			while (sum >= s) {
				sum -= arr[lt];
				lt++;
				if (sum >= s) {
					length = rt - lt + 1;
					if (answer > length) {
						answer = length;
					}
				}
			}
		}
		
		if (answer == Integer.MAX_VALUE) {
			answer = 0;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, s, arr));
	}
}