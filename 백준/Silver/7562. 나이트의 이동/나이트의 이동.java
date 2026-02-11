import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int t, List<Integer> ls, List<int[]> moves) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < t; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			
			int l = ls.get(i);
			int[] move = moves.get(i);
			
			boolean[][] visited = new boolean[l][l];
			
			Queue<int[]> q = new LinkedList<>();
			q.add(new int[] {move[0], move[1], 0});
			visited[move[0]][move[1]] = true;
			
			int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
			int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
			
			while(!q.isEmpty()) {
				int[] poll = q.poll();
				
				if (poll[0] == move[2] && poll[1] == move[3]) {
					answer.append(poll[2]);
					break;
				}
				
				for (int j = 0; j < 8; j++) {
					int x = poll[0] + dx[j];
					int y = poll[1] + dy[j];
					int num = poll[2] + 1;
					
					if (x >= 0 && y >= 0 && x < l && y < l && !visited[x][y]) {
						visited[x][y] = true;
						q.add(new int[] {x, y, num});
					}
				}
			}
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		List<Integer> ls = new ArrayList<>();
		List<int[]> moves = new ArrayList<>();
		
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			ls.add(l);
			
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			moves.add(new int[] {x1, y1, x2, y2});
		}
		
		System.out.println(solution(t, ls, moves));
	}
}