import java.util.*;
public class Main{
    public static void solution(int N, int num) {
		int[][] answer = new int[N][N];
		String point = "";
		
		// 하 우 상 좌
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		int direction = 0;
		int value = N*N;
		int x = 0;
		int y = 0;
		
		while (value > 0) {
			answer[x][y] = value;
			if (value == num) {
				point = (x+1) + " " + (y+1);
			}
			
			if (x+dx[direction] < 0 || x+dx[direction] >= N || y+dy[direction] < 0 || y+dy[direction] >= N || answer[x+dx[direction]][y+dy[direction]] != 0) {
				direction += 1;
				if (direction > 3) {
					direction %= 4;
				}
			} 
			
			x += dx[direction];
			y += dy[direction];
			value--;
		}
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j != 0) {
					sb.append(" ");
				}
				sb.append(answer[i][j]);
			}
			if (i != N-1) {
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
		System.out.println(point);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		int num = sc.nextInt();
		
		solution(N, num);
	}
}