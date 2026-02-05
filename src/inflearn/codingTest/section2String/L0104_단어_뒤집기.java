package inflearn.codingTest.section2String;

import java.util.*;
/**
 * 4. 단어 뒤집기
 * 
 * 설명 
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * 
 * 입력 
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다. 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어
 * 알파벳으로만 구성되어 있습니다.
 * 
 * 출력 
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 * 
 * 예시 입력 1
 * 3 
 * good 
 * Time 
 * Big
 * 
 * 예시 출력 1 
 * doog 
 * emiT 
 * giB
 */
public class L0104_단어_뒤집기 {
	
	public static void solution(String[] words) {
//		for (int i = 0; i < words.length; i++) {
//			String temp = "";
//			for (int j = words[i].length() -1; j >= 0; j--) {
//				temp += words[i].charAt(j);
//			}
//			System.out.println(temp);
//		}
		
		// 강의에 나온대로 char로 위치 바꿔서 출력
		for (String word : words) {
			char[] c = word.toCharArray();
			int lt = 0;
			int rt = c.length - 1 ;
			while (lt < rt) {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++;
				rt--;
			}
			System.out.println(new String(c));
		}
	}
	
	public ArrayList<String> answer1(int n, String[] str){
		ArrayList<String> answer=new ArrayList<>(); 
		for(String x : str){
			String tmp=new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	
	public ArrayList<String> answer2(int n, String[] str){
		ArrayList<String> answer=new ArrayList<>(); 
		for(String x : str){
			char[] s=x.toCharArray();
			int lt=0, rt=x.length()-1;
			while(lt<rt){
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] words = new String[n];
		
		for (int i = 0; i < n; i++) {
			words[i] = kb.next();
		}
		
		solution(words);
	}
}
