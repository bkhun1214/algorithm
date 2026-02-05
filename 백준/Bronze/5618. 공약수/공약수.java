import java.util.*;

public class Main{
    public static String solution(int n, int[] arr) {
		StringBuffer answer = new StringBuffer();
		
		int num = arr[0];
		
		for (int i = 1; i < n; i++) {
			int a = num;
			int b = arr[i];
			
			if (b > a) {
				int temp = a;
				a = b;
				b = temp;
			}
			
			while (b != 0) {
				int temp = a % b;
				a = b;
				b = temp;
			}
			
			num = a;
		}
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				if (answer.length() != 0) {
					answer.append("\n");
				}
				answer.append(i);
			}
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
				
		System.out.println(solution(n, arr));
	}
}