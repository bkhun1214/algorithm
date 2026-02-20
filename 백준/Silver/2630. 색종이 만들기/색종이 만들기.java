import java.util.*;
import java.io.*;

public class Main{
    static int[][] arr;
	static int blue = 0;
	static int white = 0;
	public static String solution(int n) {
		StringBuffer answer = new StringBuffer();
		
		paper(0, 0, n);
		
		
		answer.append(white);
		answer.append("\n");
		answer.append(blue);
		return answer.toString();
	}
	
	public static void paper(int x, int y, int n) {
		if (n == 1) {
			if (arr[x][y] == 0) {
				white++;
			} else {
				blue++;
			}
			return;
		}
		
		int num = arr[x][y];
		boolean isSame = true;
		for (int i = x; i < x+n; i++) {
			for (int j = y; j < y+n; j++) {
				if (arr[i][j] != num) {
					isSame = false;
					break;
				}
			}
		}
		
		if (isSame) {
			if (num == 0) {
				white++;
			} else {
				blue++;
			}
		} else {
			int size = n / 2;
			paper(x, y, size);
			paper(x+size, y, size);
			paper(x, y+size , size);
			paper(x+size, y+size, size);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(solution(n));
	}
}