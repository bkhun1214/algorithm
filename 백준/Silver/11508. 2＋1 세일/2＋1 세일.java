import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, List<Integer> arr) {
		int answer = 0;
		
		arr.sort((s1, s2) -> {
			return s2-s1;
		});
		
		for (int i = 0; i < n; i++) {
			if ((i+1) % 3 == 0) {
				continue;
			}
			
			answer += arr.get(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		List<Integer> arr = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		System.out.println(solution(n, arr));
	}
}