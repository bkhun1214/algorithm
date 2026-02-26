import java.util.*;
import java.io.*;

public class Main{
    public static String solution(int n, int m, int r, int[][] arr) {
		StringBuffer answer = new StringBuffer();
		
		int loops = n < m ? n/2 : m/2;
		
		for (int turn = 0; turn < r; turn++) {
			for (int loop = 0; loop < loops; loop++) {
				
				// 모서리 값 저장
				int lt = arr[loop][loop];
				int lb = arr[n-loop-1][loop];
				int rt = arr[loop][m-loop-1];
				int rb = arr[n-loop-1][m-loop-1];
				
				// 위
				for (int i = loop; i < m-loop-1; i++) {
					arr[loop][i] = arr[loop][i+1];
				}
				
				// 왼쪽
				for (int i = n-loop-1; i > loop+1; i--) {
					arr[i][loop] = arr[i-1][loop];
				}
				arr[loop+1][loop] = lt;
				
				// 아래
				for (int i = m-loop-1; i > loop+1; i--) {
					arr[n-loop-1][i] = arr[n-loop-1][i-1];
				}
				arr[n-loop-1][loop+1] = lb;
				
				// 오른쪽
				for (int i = loop; i < n-loop-2; i++) {
					arr[i][m-loop-1] = arr[i+1][m-loop-1];
				}
				arr[n-loop-2][m-loop-1] = rb;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				answer.append("\n");
			}
			for (int j = 0; j < m; j++) {
				if (j != 0) {
					answer.append(" ");
				}
				answer.append(arr[i][j]);
			}
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(solution(n, m, r, arr));
	}
}