import java.util.*;

public class Main{
    public static int solution(int N) {
		int answer = 0;
		
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			q.add(i+1);
		}
		
		while (q.size() != 1) {
			q.poll();
			q.add(q.poll());
		}
		
		answer = q.poll();
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(solution(N));
	}
}