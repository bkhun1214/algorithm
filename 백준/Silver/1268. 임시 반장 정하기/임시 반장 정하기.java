import java.util.*;
public class Main{
    public static int solution(int N, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		int[] student = new int[N];
		
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				for (int k = 0; k < 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						student[i]++;
						student[j]++;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			if (student[i] > max) {
				max = student[i];
				answer = i+1; // 1부터 시작 
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr = new int[N][5];
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		
		System.out.println(solution(N,arr));
	}
}