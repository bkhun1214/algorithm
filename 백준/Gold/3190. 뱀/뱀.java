import java.util.*;

public class Main{
    public static int solution(int n, int[][] arr, Map<Integer, String> moves) {
		int answer = 0;
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		int direction = 0;
		int startX = 0;
		int startY = 0;
		
		List<String> snake = new ArrayList<>();
		int tail = 0;
		snake.add("0 0");
		
		while (true) {
			answer++;
			startX += dx[direction];
			startY += dy[direction];
			
			// 벽에 부딪히면
			if (startX < 0 || startY < 0 || startX >= n || startY >= n) {
				break;
			}
			
			// 자신의 몸과 부딪히면
			if (arr[startX][startY] == 1) {
				break;
			}
			
			snake.add(startX + " " + startY);
			
			// 사과 없으면
			if (arr[startX][startY] == 0) {
				String[] tails = snake.get(tail).split(" ");
				int x = Integer.valueOf(tails[0]);
				int y = Integer.valueOf(tails[1]);
				arr[x][y] = 0;
				
				tail++;
			}
			
			arr[startX][startY] = 1;
			
			// 방향
			if (moves.get(answer) != null) {
				String move = moves.get(answer);
				
				if (move.equals("L")) {
					direction -= 1;
				} else {
					direction += 1;
				}
				
				if (direction < 0) {
					direction += 4;
				} else if (direction > 3) {
					direction -= 4;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int[n][n];
		
		int k = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < k; i++) {
			arr[sc.nextInt()-1][sc.nextInt()-1] = 2;
			sc.nextLine();
		}
		
		int l = sc.nextInt();
		sc.nextLine();
		
		Map<Integer, String> moves = new HashMap<>();
		for (int i = 0; i < l; i++) {
			String[] s = sc.nextLine().split(" ");
			moves.put(Integer.valueOf(s[0]), s[1]);
		}
		
		System.out.println(solution(n, arr, moves));
	}
}