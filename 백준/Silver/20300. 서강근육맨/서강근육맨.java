import java.util.*;
import java.io.*;

public class Main{
    public static Long solution(int n, List<Long> arr) {
		Long answer = 0L;
		
		if (n % 2 == 1) {
			n++;
			arr.add(0L);
		}
		
		arr.sort(null);
		
		for (int i = 0; i < n / 2; i++) {
			Long a = arr.get(i);
			Long b = arr.get(n-i-1);
			
			if (answer < a+b) {
				answer = a+b;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		List<Long> arr = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr.add(Long.parseLong(st.nextToken()));
		}
		
		System.out.println(solution(n, arr));
	}
}