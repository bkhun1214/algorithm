import java.util.*;
public class Main{
    public static int solution(int n, int k) {
		int answer = 0;
		int[] arr = new int[n+1];
		
		for (int i = 2; i <= n; i++) {
			if (arr[i] == 0) {
				
				for (int j = i; j <= n; j += i) {
					if (arr[j] == 0) {
						arr[j] = 1;
						if (--k == 0) {
							return j;
						}
					}
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		
		System.out.println(solution(n, k));
	}
}