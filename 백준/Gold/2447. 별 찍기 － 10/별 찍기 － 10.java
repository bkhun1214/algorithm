import java.util.*;
import java.io.*;

public class Main{
    static char[][] arr;
	public static String solution(int n) {
		StringBuffer answer = new StringBuffer();
		
		star(0, 0, n);
		
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			for (int j = 0; j < n; j++) {
				answer.append(arr[i][j]);
			}
		}
		
		return answer.toString();
	}
	
	public static void star(int x, int y, int n) {
		if (n == 1) {
			arr[x][y] = '*';
		} else {
		
			int size = n / 3;
			
			int num = 0;
			
			for (int i = x; i < x+n; i += size) {
				for (int j = y; j < y+n; j += size) {
					num++;
					if (num == 5) {
						blank(i, j, size);
					} else {
						star(i, j, size);
					}
					
				}
			}
		}
	}
	
	public static void blank(int x, int y, int n) {
		if (n == 1) {
			arr[x][y] = ' ';
		} else {
		
			int size = n / 3;
			
			for (int i = x; i < x+n; i += size) {
				for (int j = y; j < y+n; j += size) {
					blank(i, j, size);
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		arr = new char[n][n];
		
		System.out.println(solution(n));
	}
}