package inflearn.codingTest.section3Array;

import java.util.*;

/**
 * 5. 소수(에라토스테네스 체) 
 * 
 * 설명
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * 
 * 입력
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * 
 * 출력
 * 첫 줄에 소수의 개수를 출력합니다.
 * 
 * 예시 입력 1
 * 20 
 * 
 * 예시 출력 1
 * 8
 */
public class L0205 {

	// 에라토스테네스
	// n + 1 만큼 int[] 선언 및 0으로 채우기
	// 반복문으로 int[n] = 0 이면 answer++ 밑 배수 전부 1로 변경
	// ex)
	// 숫자 2 일 때 answer++ 밑 2의 배수는 모두 체크 1로 수정
	// 숫자 3 일 때 answer++ 밑 3의 배수는 모두 체크 1로 수정
	// n 까지 반복
	
	public static int solution(int n) {
		int answer = 0;
		int[] ch = new int[n+1];
		
		for (int i = 2; i <= n; i++) {
			if (ch[i] == 0) {
				answer ++;
				for (int j=i; j <= n; j+=i) {
					ch[j] = 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(solution(n));
	}
}

