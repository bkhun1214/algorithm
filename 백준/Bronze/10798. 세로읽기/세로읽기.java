import java.util.*;
public class Main{
    public static String solution(String[] arr) {
		String answer = "";
		
		String[][] letter = new String[5][15];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				letter[i][j] = arr[i].substring(j, j+1);
			}
		}
		
		for (int i = 0; i < letter[0].length; i++) {
			for (int j = 0; j < letter.length; j++) {
				if (letter[j][i] != null) {
					answer += letter[j][i];
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextLine();
		}

		System.out.println(solution(arr));
	}
}