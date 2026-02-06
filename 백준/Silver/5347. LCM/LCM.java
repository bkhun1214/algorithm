import java.util.*;

public class Main{
    public static String solution(int n, int[][] arr) {
		StringBuffer answer = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			
			int num1 = arr[i][0];
			int num2 = arr[i][1];
			
			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			while (num2 != 0) {
				int temp = num1 % num2;
				num1 = num2;
				num2 = temp;
			}
			
			if (i != 0) {
				answer.append("\n");
			}
			answer.append((long)arr[i][0] * arr[i][1] / num1);
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println(solution(n, arr));
	}
}