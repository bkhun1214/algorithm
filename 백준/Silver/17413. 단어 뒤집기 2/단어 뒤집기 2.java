import java.util.*;
public class Main{
    public static String solution(String word) {
		StringBuffer answer = new StringBuffer();
		
		while (!word.isEmpty()) {
			String temp;
			int startIndex = word.indexOf("<");
			if (startIndex != -1) {
				temp = word.substring(0, startIndex);
			} else {
				temp = word;
			}
			
			if (!temp.isEmpty()) {
				String[] split = temp.split(" ");
				for (int i = 0; i < split.length; i++) {
					StringBuffer sb = new StringBuffer();
					if (i != 0) {
						answer.append(" ");
					}
					sb.append(split[i]);
					answer.append(sb.reverse());
				}
			}
			
			if (startIndex != -1) {
				int endIndex = word.indexOf(">");
				answer.append(word.substring(startIndex, endIndex + 1));
				word = word.substring(endIndex + 1, word.length());
			} else {
				word = "";
			}
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		System.out.println(solution(word));
	}
}