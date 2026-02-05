package inflearn.codingTest.section3Array;

import java.util.*;

/**
 * 9. 격자판 최대합
 * 
 * 설명
 * 
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * 
 * Image1.jpg
 * 
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 * 
 * 
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * 
 * 출력
 * 최대합을 출력합니다.
 * 
 * 
 * 예시 입력 1
 * 5 
 * 10 13 10 12 15 
 * 12 39 30 23 11 
 * 11 25 50 53 15 
 * 19 27 29 37 27 
 * 19 13 30 13 19
 * 
 * 예시 출력 1
 * 155
 */
public class L0209_격자판_최대합 {
	
	public static int solution(int N, int[][] arr) {
		int answer = 0;
		
		// 각 행의 합 // 각 열의 합
		for (int i = 0; i < N; i++) {
			int row = 0;
			int column = 0;
			for (int j = 0; j < N; j++) {
				row += arr[i][j];
				column += arr[j][i];
			}
			if (answer < row) {
				answer = row;
			}
			
			if (answer < column) {
				answer = column;
			}
		}
		
		// 두 대각선의 합
		int left = 0;
		int right = 0;
		for (int i = 0; i < N; i++) {
			left += arr[i][i];
			right += arr[i][N-(i+1)];
		}
		
		if (answer < left) {
			answer = left;
		}
		
		if (answer < right) {
			answer = right;
		}
		
		return answer;
	}
	
	public int answer(int n, int[][] arr){
		int answer=-2147000000;
		int sum1=0, sum2=0;
		for(int i=0; i<n; i++){
			sum1=sum2=0;
			for(int j=0; j<n; j++){
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer=Math.max(answer, sum1);
			answer=Math.max(answer, sum2);
		}
		sum1=sum2=0;
		for(int i=0; i<n; i++){
			sum1+=arr[i][i];
			sum2+=arr[i][n-i-1];
		}
		answer=Math.max(answer, sum1);
		answer=Math.max(answer, sum2);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		
		System.out.println(solution(N,arr));
	}
}
