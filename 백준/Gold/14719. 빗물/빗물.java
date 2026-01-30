import java.util.*;

public class Main{
    public static int solution(int H, int W, int[] block) {
		int answer = 0;
		
		for (int i = 1; i < W-1; i++) {
			
			int left = 0;
			int right = 0;
			
			// 좌측 최댓값
			for (int j = i-1; j >= 0; j--) {
				if (left < block[j]) {
					left = block[j];
				}
			}
			
			// 우측 최댓값
			for (int j = i+1; j < W; j++) {
				if (right < block[j]) {
					right = block[j];
				}
			}
			
			// 좌측, 우측 중 최솟값
			int min;
			if (left > right) {
				min = right;
			} else {
				min = left;
			}
			
			// 빗물 더하기
			if (block[i] < min) {
				answer += min-block[i];
			}
		}

		return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.nextLine();
		
		int[] block = new int[W];
		
		for (int i = 0; i < W; i++) {
			block[i] = sc.nextInt();
		}
		
		System.out.println(solution(H, W, block));
	}
}