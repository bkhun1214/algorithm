import java.util.*;
import java.io.*;

public class Main{
    public static String solution(String s) {
		StringBuffer answer = new StringBuffer();
		StringBuffer max = new StringBuffer();
		StringBuffer min = new StringBuffer();
		int maxM = 0;
		int minM = 0;
		
		for (char c : s.toCharArray()) {
			if (c == 'M') {
				maxM++;
				minM++;
			} else {
				// 최댓값
				max.append("5");
				for (int i = 0; i < maxM; i++) {
					max.append("0");
				}
				
				// 최솟값
				if (minM != 0) {
					min.append("1");
				}
				for (int i = 1; i < minM; i++) {
					min.append("0");
				}
				min.append("5");
				
				// 초기화
				maxM = 0;
				minM = 0;
			}
		}
		
		for (int i = 0; i < maxM; i++) {
			max.append("1");
		}
		
		if (minM != 0) {
			min.append("1");
			for (int i = 1; i < minM; i++) {
				min.append("0");
			}
		}
		
		answer.append(max);
		answer.append("\n");
		answer.append(min);
		
		return answer.toString();
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken();
		
		System.out.println(solution(s));
	}
}