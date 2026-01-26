import java.util.*;
public class Main{
    public static String solution(int N, int[] arr) {
		String answer = "";
		
		int money1 = N;
		int money2 = N;
		int count1 = 0;
		int count2 = 0;
		
		int up = 0;
		int down = 0;
		
		for (int i = 0; i < 14; i++) {
			// BNP
			if (money1 / arr[i] > 0) {
				int temp = money1 / arr[i];
				count1 += temp;
				money1 -= arr[i] * temp;
			}
			
			// TIMING
			if (i != 0) {
				if (arr[i-1] == arr[i]) {
					up = 0;
					down = 0;
				} else if (arr[i-1] < arr[i]) {
					up += 1;
					down = 0;
					
					if (up == 3) {
						if (count2 != 0) {
							money2 += count2 * arr[i];
							count2 = 0;
						}
						up -= 1;
					}
					
				} else if (arr[i-1] > arr[i]) {
					down += 1;
					up = 0;
					
					if (down == 3) {
						if (money2 / arr[i] > 0) {
							int temp = money2 / arr[i];
							count2 += temp;
							money2 -= arr[i] * temp;
						}
						down -= 1;
					}
				}
			}
		}
		
		int last = arr[13];
		
		if (((count1 * last) + money1) == ((count2 * last) + money2)) {
			answer = "SAMESAME";
			return answer;
		}
		
		answer = ((count1 * last) + money1) > ((count2 * last) + money2) ? "BNP" : "TIMING";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[14];
		
		for (int i = 0; i < 14; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(N, arr));
	}
}