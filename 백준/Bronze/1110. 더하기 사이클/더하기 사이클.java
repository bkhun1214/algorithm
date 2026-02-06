import java.util.*;

public class Main{
    public static int solution(int n) {
		int answer = 0;
		
		int num = n;
		int left = 0;
		int right = 0;
		
		while (true) {
			answer++;
			left = num / 10;
			right = num % 10;
			
			num = (right*10) + ((left+right) % 10);
			
			if (num == n) {
				break;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(solution(n));
	}
}