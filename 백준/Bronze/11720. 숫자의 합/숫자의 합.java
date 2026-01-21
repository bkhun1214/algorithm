import java.util.*;
public class Main {
    public static int solution(int n, String s) {
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			answer += Integer.parseInt(s.substring(i, i+1));
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
	
		System.out.println(solution(n, s));
	}
}