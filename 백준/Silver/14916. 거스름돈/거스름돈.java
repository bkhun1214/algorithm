import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n) {
		int answer = 0;
		
		if (n == 1 || n == 3) {
			return -1;
		}
		
		answer += n / 5;
		n = n % 5;
		
		if (n % 2 != 0) {
			answer--;
			n += 5;
		}
		
		answer += n / 2;
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		System.out.println(solution(n));
	}
}