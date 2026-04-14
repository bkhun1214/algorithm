import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int h, int w, int x, int y, int[][] arr) {
		StringBuffer sb = new StringBuffer();
		int[][] answer = new int[h][w];
		
		for (int i = 0; i < h+x; i++) {
			for (int j = 0; j < w+y; j++) {
				int temp = arr[i][j];
				
				if (temp != 0) {
					
					boolean case1 = false;
					boolean case2 = false;
				
					if (i >= 0 && j >= 0 && i < h && j < w) {
						case1 = true;
					}
					
					if (i-x >= 0 && j-y >= 0 && i-x < h && j-y < w) {
						case2 = true;
					}
				
					if (case1) {
						if (case2) {
							answer[i][j] = temp-answer[i-x][j-y];
						} else {
							answer[i][j] = temp;
						}
					} else {
						if (case1) {
							answer[i][j] = temp;
						}
					}
				}
			}
		}
		
		
		for (int i = 0; i < h; i++) {
			if (i != 0) {
				sb.append("\n");
			}
			for (int j = 0; j < w; j++) {
				if (j != 0) {
					sb.append(" ");
				}
				sb.append(answer[i][j]);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[h+x][w+y];
		
		for (int i = 0; i < h+x; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < w+y; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(solution(h, w, x, y, arr));
	}
}