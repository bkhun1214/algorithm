import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, String s) {
		int answer = 0;
		int blue = 0;
		int red = 0;
		
		char prev = 0;
		
		for (char c : s.toCharArray()) {
			if (prev == c) {
				continue;
			} else {
				prev = c;
				
				if (c == 'B') {
					blue++;
				} else {
					red++;
				}
			}
		}
		
		if (blue > red) {
			answer = red+1;
		} else {
			answer = blue+1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		
		System.out.println(solution(n, s));
	}
}