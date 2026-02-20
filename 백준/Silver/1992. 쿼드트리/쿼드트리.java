import java.util.*;
import java.io.*;

public class Main{
    static int[][] arr;
	
	public static String solution(int n) {
		StringBuffer sb = new StringBuffer();
		sb.append(quadTree(0, 0, n));
		
		return sb.toString();
	}
	
	public static String quadTree(int x, int y, int n) {
		StringBuffer sb = new StringBuffer();
		int temp = arr[x][y];
		
		if (n == 1) {
			sb.append(temp);
			return sb.toString();
		}
		
		boolean isSame = true;
		
		for (int i = x; i < x+n; i++) {
			for (int j = y; j < y+n; j++) {
				if (temp != arr[i][j]) {
					isSame = false;
					break;
				}
			}
		}
		
		if (isSame) {
			sb.append(temp);
		} else {
			int size = n / 2;
			
			sb.append("(");
			
			// 왼쪽 위, 오른쪽 위, 왼쪽 아래, 오른쪽 아래
			sb.append(quadTree(x, y, size));
			sb.append(quadTree(x, y+size, size));
			sb.append(quadTree(x+size, y, size));
			sb.append(quadTree(x+size, y+size, size));
			
			sb.append(")");
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < n; j++) {
				arr[i][j] = line.charAt(j) - '0';
			}
		}
		
		System.out.println(solution(n));
	}
}