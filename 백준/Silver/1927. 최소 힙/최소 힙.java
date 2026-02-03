import java.util.*;

public class Main{
    public static String solution(int n, int[] command) {
		StringBuffer answer = new StringBuffer();
		
		Queue<Integer> q = new PriorityQueue<>();
		
		for (int i = 0; i < n; i++) {
			int num = command[i];
			
			if (num == 0) {
				
				if (answer.length() != 0) {
					answer.append("\n");
				}
				
				if (q.isEmpty()) {
					answer.append("0");
				} else {
					answer.append(q.poll());
				}
			} else {
				q.add(num);
			}
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] command = new int[n];
		
		for (int i = 0; i < n; i++) {
			command[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, command));
	}
}