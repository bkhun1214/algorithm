import java.util.*;

public class Main{
    public static String solution(int a, int b) {
		StringBuffer answer = new StringBuffer();
		
		int x = a;
		int y = b;
		
		if (y > x) {
			int temp = x;
			x = y;
			y = temp;
		}
		
		while (y != 0) {
			int temp = x % y;
			x = y;
			y = temp;
		}
		
		answer.append(x);
		answer.append("\n");
		answer.append((a*b)/x);
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(solution(a, b));
	}
}