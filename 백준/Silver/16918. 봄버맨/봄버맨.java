import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int r, int c, int n, char[][][] arr) {
		StringBuffer sb = new StringBuffer();
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		char[][] answer = new char[r][c];
		
		if (n == 1) {
			answer = arr[n];
		} else {
			n = n % 4;
			if (n == 0 || n == 2) {
				answer = arr[2];
			} else {
				for (int i = 0; i < r; i++) {
					Arrays.fill(answer[i], 'O');
				}
				for (int i = 0; i < r; i++) {
					for (int j = 0; j < c; j++) {
						if (arr[0][i][j] == 'O') {
							answer[i][j] = '.';
							for (int k = 0; k < 4; k++) {
								int x = i + dx[k];
								int y = j + dy[k];
								if (x >= 0 && y >= 0 && x < r && y < c) {
									answer[x][y] = '.';
								}
							}
						}
					}
				}
				
				if (n == 1) {
					
					for (int i = 0; i < r; i++) {
						if (i != 0) {
							sb.append("\n");
						}
						for (int j = 0; j < c; j++) {
							boolean isTrue = true;
							if (answer[i][j] == '.') {
								for (int k = 0; k < 4; k++) {
									int x = i + dx[k];
									int y = j + dy[k];
									if (x >= 0 && y >= 0 && x < r && y < c && answer[x][y] == 'O') {
										isTrue = false;
										break;
									}
								}
								
								if (isTrue) {
									sb.append('O');
								} else {
									sb.append('.');
								}
							} else {
								sb.append('.');
							}
						}
					}
					
					return sb.toString();
				}
			
			}
		}
		
		for (int i = 0; i < r; i++) {
			if (i != 0) {
				sb.append("\n");
			}
			for (int j = 0; j < c; j++) {
				sb.append(answer[i][j]);
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		char[][][] arr = new char[5][r][c];
		
		for (int i = 0; i < r; i++) {
			String line = br.readLine();
			for (int j = 0; j < c; j++) {
				arr[0][i][j] = line.charAt(j);
				arr[1][i][j] = line.charAt(j);
				arr[2][i][j] = 'O';
			}
		}
		
		System.out.println(solution(r, c, n, arr));
	}
}