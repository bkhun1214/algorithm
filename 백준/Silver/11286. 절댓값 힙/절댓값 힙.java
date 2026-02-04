import java.util.*;

public class Main{
    public static String solution(int n, int[] arr) {
		StringBuffer answer = new StringBuffer();
		
		Queue<Integer> q = new PriorityQueue<Integer>((s1, s2) -> {
			int abs1 = Math.abs(s1);
			int abs2 = Math.abs(s2);
			
			if (abs1 != abs2) {
				return abs1 - abs2;
			} else {
				return s1 - s2;
			}
		});
		
		for (int i = 0; i < n; i++) {
			int x = arr[i];
			
			if (x != 0) {
				q.add(x);
			} else {
				if (answer.length() != 0) {
					answer.append("\n");
				}
				
				if (q.isEmpty()) {
					answer.append("0");
				} else {
					answer.append(q.poll());
				}
			}
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println(solution(n, arr));
	}
}