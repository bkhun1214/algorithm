import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int[] arr) {
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			int count = 0;
			
			// 왼쪽
			for (int j = 0; j < i; j++) {
				if (j+1 == i) {
					count++;
					continue;
				}
				
				double a = (double) (arr[i] - arr[j]) / (i - j);
				double b = arr[i] - (a * i);
				
				boolean isWatch = true;
				for (int k = j+1; k < i; k++) {
					if (arr[k] >= ((a * k) + b)) {
						isWatch = false;
						break;
					}
				}
				
				if (isWatch) {
					count++;
				}
			}
			
			// 오른쪽
			for (int j = i+1; j < n; j++) {
				if (j-1 == i) {
					count++;
					continue;
				}
				
				double a = (double) (arr[i] - arr[j]) / (i - j);
				double b = arr[i] - (a * i);
				
				boolean isWatch = true;
				for (int k = i+1; k < j; k++) {
					if (arr[k] >= ((a * k) + b)) {
						isWatch = false;
						break;
					}
				}
				
				if (isWatch) {
					count++;
				}
			}
			
			if (answer < count) {
				answer = count;
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