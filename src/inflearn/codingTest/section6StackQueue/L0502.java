package inflearn.codingTest.section6StackQueue;

import java.util.*;
import java.io.*;

/**
 * 2. 괄호문자제거 
 * 
 * 설명
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 * 
 * 
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * 
 * 
 * 출력
 * 남은 문자만 출력한다.
 * 
 * 예시 입력 1
 * (A(BC)D)EF(G(H)(IJ)K)LM(N) 
 * 
 * 예시 출력 1
 * EFLM
 */
public class L0502 {
	
	public static String solution(String s) {
		StringBuffer answer = new StringBuffer();
		
		Stack<Character> stack = new Stack<>();
		
		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				stack.pop();
			} else {
				if (stack.isEmpty()) {
					answer.append(c);
				}
			}
		}
		
		
		return answer.toString();
	}
	
	public String answer(String str) {
		String answer="";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x==')') {
				while(stack.pop() != '(');
			} 
			else stack.push(x);
		}
		for(int i=0; i < stack.size(); i++) answer+=stack.get(i);
		return answer;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		System.out.println(solution(s));
	}
}
