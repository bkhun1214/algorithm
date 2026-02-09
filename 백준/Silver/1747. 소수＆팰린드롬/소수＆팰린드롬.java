import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n) {
		int answer = 0;
		// 결과의 최댓값은 1003001
		int[] arr = new int[1003002];
		arr[1] = 1;
		
		for (int i = 2; i <= 1003001; i++) {
			if (arr[i] == 0) {
				for (int j = i+i; j <= 1003001; j+=i) {
					arr[j] = 1;
				}
			}
		}
		
		for (int i = n; i <= 1003001; i++) {
			if (arr[i] == 0) {
				
				StringBuffer sb = new StringBuffer();
				sb.append(i);
				sb.reverse();
				
				if (i == Integer.parseInt(sb.toString())) {
					return i;
				} else {
					for (int j = i+i; j <= n; j+=i) {
						arr[j] = 1;
					}
				}
				
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solution(n));
	}
}