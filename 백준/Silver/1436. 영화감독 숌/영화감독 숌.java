import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n) {
		if (n == 1) {
			return 666;
		}
		
		int num = 1666;
		int count = 1;
		
		while (true) {
			if (String.valueOf(num).contains("666")) {
				count++;
				
				if (n == count) {
					return num;
				}
			}
			num++;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		System.out.println(solution(n));
	}
}