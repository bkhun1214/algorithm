import java.util.*;
public class Main{
    public static String solution(int N, int[][] arr) {
		String answer = "";
		int[] grade = new int[N];
		
		for (int i = 0; i < N; i++) {
			int temp = 1;
			
			int height = arr[i][0];
			int weight = arr[i][1];
			
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				
				if (height < arr[j][0] && weight < arr[j][1]) {
					temp++;
				}
			}
			grade[i] = temp;
		}
		
		for (int i = 0; i < N; i++) {
			if (i != 0) {
				answer += " ";
			}
			answer += grade[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		int[][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println(solution(N, arr));
	}
}