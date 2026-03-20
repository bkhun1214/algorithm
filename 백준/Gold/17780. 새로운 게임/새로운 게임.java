import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int k, int[][] arr, int[][] chess) {
		int answer = 0;
		
		Map<String, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < chess.length; i++) {
			List<Integer> list = new ArrayList<>();
			list.add(i);
			map.put(String.format("%d %d", chess[i][0], chess[i][1]), list);
		}
		
		//→, ←, ↑, ↓
		int[] dx = {0, 0, -1, 1};
		int[] dy = {1, -1, 0, 0};
		
		while (answer < 1001) {
			answer++;
			boolean isEnd = false;
			
			for (int i = 0; i < chess.length; i++) {
				int[] c = chess[i];
				String start = String.format("%d %d", c[0], c[1]);
				List<Integer> list = map.get(start);
				if (i != list.get(0)) {
					continue;
				}
				int x = c[0] + dx[c[2]];
				int y = c[1] + dy[c[2]];
				
				if (x < 0 || y < 0 || x >= n || y >= n || arr[x][y] == 2) {
					if (c[2] == 0) {
						c[2] = 1;
					} else if (c[2] == 1) {
						c[2] = 0;
					} else if (c[2] == 2) {
						c[2] = 3;
					} else {
						c[2] = 2;
					}
					
					x = c[0] + dx[c[2]];
					y = c[1] + dy[c[2]];
					if (x < 0 || y < 0 || x >= n || y >= n || arr[x][y] == 2) {
						continue;
					}
				} 
				
				List<Integer> add = new ArrayList<>();
				if (arr[x][y] == 1) {
					for (int j = list.size()-1; j >= 0; j--) {
						add.add(list.get(j));
					}
				} else {
					for (int j = 0; j < list.size(); j++) {
						add.add(list.get(j));
					}
				}
				
				String end = String.format("%d %d", x, y);

				List<Integer> move = new ArrayList<>();
				if (map.get(end) != null) {
					move = map.get(end);
					
					if (move.size() + add.size() >= 4) {
						isEnd = true;
						break;
					}
				}
				move.addAll(add);
				map.put(end, move);
				map.remove(start);
				for (int j = 0; j < move.size(); j++) {
					int temp = move.get(j);
					chess[temp][0] = x;
					chess[temp][1] = y;
				}
			}
			
			if (isEnd) {
				break;
			}
		}
		
		return answer < 1001 ? answer : -1;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < n ; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] chess = new int[k][3];
		
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				chess[i][j] = Integer.parseInt(st.nextToken()) - 1;
			}
		}
		
		System.out.println(solution(n, k, arr, chess));
	}
}