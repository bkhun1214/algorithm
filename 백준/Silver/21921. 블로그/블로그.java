import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, int x, int[] arr) {
		StringBuffer answer = new StringBuffer();
		int max = 0;
		int days = 0;
		int cal = 0;
		
		for (int i = 0; i < x; i++) {
			cal += arr[i];
		}
		
		max = cal;
		days = 1;
		int lt = 0;
		int rt = x;
		
		for (int i = x; i < n; i++) {
			cal -= arr[lt];
			lt++;
			cal += arr[rt];
			rt++;
			
			if (cal > max) {
				max = cal;
				days = 1;
			} else if (cal == max) {
				days++;
			}
		}
		
		if (max == 0) {
			answer.append("SAD");
		} else {
			answer.append(max);
			answer.append("\n");
			answer.append(days);
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, x, arr));
	}
}