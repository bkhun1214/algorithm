package inflearn.codingTest.section2String;

import java.util.*;

/**
 * 10. 가장 짧은 문자거리 
 * 
 * 설명
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * 
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 * 
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 * 
 * 예시 입력 1
 * teachermode e 
 * 
 * 예시 출력 1
 * 1 0 1 2 1 0 1 2 2 1 0
 */

public class L0110 {

	public static String solution(String s, String t) {
		StringBuilder answer = new StringBuilder();
		
		List<Integer> indexs = new ArrayList<Integer>();
		
		int i = s.indexOf(t);
		
		while (i != -1) {
			indexs.add(i);
			i = s.indexOf(t, i + 1);
		}
		
//		for (int i = 0; i < s.length(); i++) {
//			if (String.valueOf(s.charAt(i)).equals(t)) {
//				indexs.add(i);
//			}
//		}
//		
		
		for (int j = 0; j < s.length(); j++) {
			if (j != 0) {
				answer.append(" ");
			}
			
			int temp = Integer.MAX_VALUE;
			
			for (int index : indexs) {
				int value = Math.abs(index - j);
				if (temp > value) {
					temp = value;
				}
			}
			
			answer.append(temp);
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		String[] splits = str.split(" ");
		System.out.println(solution(splits[0], splits[1]));
	}
}
