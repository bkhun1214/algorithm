import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int a, int b) {
		int answer = -1;
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {b, 1});
		
		while (!q.isEmpty()) {
			int[] poll = q.poll();
			
			if (poll[0] == a) {
				return poll[1];
			} else if (poll[0] < a) {
				continue;
			}
			
			if (poll[0] % 10 == 1) {
				q.add(new int[] {poll[0] / 10, poll[1]+1});
			}
			
			if (poll[0] % 2 == 0) {
				q.add(new int[] {poll[0] / 2, poll[1]+1});
			}
		}
		
		return answer;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(solution(a, b));
	}
}