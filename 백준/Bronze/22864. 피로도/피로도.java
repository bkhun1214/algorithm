import java.util.*;

public class Main{
    public static int solution(int a, int b, int c, int m) {
		int answer = 0;
		
		int tired = 0;
		
		for (int i = 0; i < 24; i++) {
			if (tired + a <= m) {
				tired += a;
				answer += b;
			} else {
				tired -= c;
				if (tired < 0) {
					tired = 0;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(solution(a, b, c, m));
	}
}