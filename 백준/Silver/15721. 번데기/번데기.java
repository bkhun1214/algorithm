import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int t, int m) {
		
		int num = 0;
		int count = -1;
		
		if (m == 0) {
		
			while (t > 0) {
				num++;
				
				// 뻔
				t--;
				count++;
				if (t == 0) {
					return count % n;
				}
				// 데기
				count++;
				
				// 뻔
				t--;
				count++;
				if (t == 0) {
					return count % n;
				}
				// 데기
				count++;
				
				// 뻔 n+1번
				for (int i = 0; i < num+1; i++) {
					t--;
					count++;
					if (t == 0) {
						return count % n;
					}
				}
				
				// 데기 n+1번
				count += num+1;
			}
		} else {
			while (t > 0) {
				num++;
				
				// 뻔
				count++;
				
				// 데기
				t--;
				count++;
				if (t == 0) {
					return count % n;
				}
				
				// 뻔
				count++;
				
				// 데기
				t--;
				count++;
				if (t == 0) {
					return count % n;
				}
				
				// 뻔 n+1번
				count += num+1;
				
				// 데기 n+1번
				for (int i = 0; i < num+1; i++) {
					t--;
					count++;
					if (t == 0) {
						return count % n;
					}
				}
				
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());

		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		
		System.out.println(solution(n, t, m));
	}
}