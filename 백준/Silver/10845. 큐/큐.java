import java.util.*;

public class Main{
    public static void solution(int N, String[] lines) {
		
		Deque<Integer> q = new LinkedList<>();
		
		for (String line : lines) {
			
			if (line.startsWith("push")) {
				int i = Integer.valueOf(line.split(" ")[1]);
				q.add(i);
			} else if (line.startsWith("pop")) {
				System.out.println(q.isEmpty() ? "-1" : q.poll());
			} else if (line.startsWith("size")) {
				System.out.println(q.size());
			} else if (line.startsWith("empty")) {
				System.out.println(q.isEmpty() ? "1" : "0");
			} else if (line.startsWith("front")) {
				System.out.println(q.isEmpty() ? "-1" : q.peek());
			} else if (line.startsWith("back")) {
				System.out.println(q.isEmpty() ? "-1" : q.peekLast());
			}
		}
		
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		String[] lines = new String[N];
		
		for (int i = 0; i < N; i++) {
			lines[i] = sc.nextLine();
		}
		
		solution(N, lines);
	}
}