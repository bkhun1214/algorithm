import java.util.*;
public class Main{
    public static String solution(int H, int W, String[] area) {
		String answer = "";
		int[][] cloud = new int[H][W];
		
		for (int i = 0; i < H; i++) {
			int temp = -1;
			for (int j = 0; j < W; j++) {
				char c = area[i].charAt(j);
				if (c == 'c') {
					temp = 0;
				} else if (c != 'c' && temp != -1) {
					temp += 1;
				}
				
				cloud[i][j] = temp;
			}
		}
		
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (j != 0) {
					answer += " ";
				}
				answer += cloud[i][j];
			}
			answer += "\n";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.nextLine();
		
		String[] area = new String[H];
		
		for (int i = 0; i < H; i++) {
			area[i] = sc.nextLine();
		}
		
		System.out.println(solution(H, W, area));
	}
}