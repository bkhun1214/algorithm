import java.util.*;
import java.io.*;

public class Main{
    public static int solution(int n, int k, int[][] arr, Map<String, List<Integer>> map, int[][] chess) {
		int answer = 0;
		
		int[] dx = {0, 0, -1, 1};
		int[] dy = {1, -1 , 0, 0};
		
		while (answer < 1001) {
			answer++;
			
			for (int i = 0; i < k; i++) {
				int x = chess[i][0] + dx[chess[i][2]];
				int y = chess[i][1] + dy[chess[i][2]];
				
				if (x < 0 || y < 0 || x >= n || y >= n || arr[x][y] == 2) {
					// 파란색
					int direction = changeDirection(chess[i][2]);
					chess[i][2] = direction;
					
					x = chess[i][0] + dx[direction];
					y = chess[i][1] + dy[direction];
					
					if (x < 0 || y < 0 || x >= n || y >= n || arr[x][y] == 2) {
						continue;
					}
				}
				
				String prevChess = String.format("%d %d", chess[i][0], chess[i][1]);
				List<Integer> prev = map.get(prevChess);
				List<Integer> move = new ArrayList<>();
				int index = 0;
				boolean isMove = false;
				for (int j = 0; j < prev.size(); j++) {
					int temp = prev.get(j);
					if (temp == i) {
						index = j;
						isMove = true;
					}
					if (isMove) {
						move.add(temp);
					}
				}
				
				for (int j = prev.size()-1; j >= index; j--) {
					prev.remove(j);
				}
				
				map.put(prevChess, prev);
				
				String currChess = String.format("%d %d", x, y);
				List<Integer> current = map.get(currChess);
				
				if (move.size() + current.size() >= 4) {
					return answer;
				}
				
				if (arr[x][y] == 0) {
					// 흰색
					for (int j = 0; j < move.size(); j++) {
						int temp = move.get(j);
						current.add(temp);
						chess[temp][0] = x;
						chess[temp][1] = y;
					}
				} else {
					// 빨간색
					for (int j = move.size()-1; j >=0; j--) {
						int temp = move.get(j);
						current.add(temp);
						chess[temp][0] = x;
						chess[temp][1] = y;
					}
				}
				map.put(currChess, current);
			}
		}
		
		if (answer == 0 || answer > 1000) {
			answer = -1;
		}
		
		return answer;
	}
	
	public static int changeDirection(int direction) {
		if (direction == 0) {
			return 1;
		} else if (direction == 1) {
			return 0;
		} else if (direction == 2) {
			return 3;
		} else {
			return 2;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][n];
		Map<String, List<Integer>> map = new HashMap<>();
		int[][] chess = new int[k][3];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				String format = String.format("%d %d", i, j);
				map.put(format, new ArrayList<>());
			}
		}
		
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			int direction = Integer.parseInt(st.nextToken()) - 1;
			
			chess[i][0] = start;
			chess[i][1] = end;
			chess[i][2] = direction;
			
			String format = String.format("%d %d", start, end);
			List<Integer> list = map.get(format);
			list.add(i);
			map.put(format, list);
		}
		
		System.out.println(solution(n, k, arr, map, chess));
	}
}