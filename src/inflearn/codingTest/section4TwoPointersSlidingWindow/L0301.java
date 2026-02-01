package inflearn.codingTest.section4TwoPointersSlidingWindow;

import java.util.*;

/**
 * 1. 두 배열 합치기
 * 
 * 설명
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 * 
 * 
 * 입력
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 * 
 * 출력
 * 오름차순으로 정렬된 배열을 출력합니다.
 * 
 * 예시 입력 1
 * 3 
 * 1 3 5 
 * 5 
 * 2 3 6 7 9 
 * 
 * 예시 출력 1
 * 1 2 3 3 5 6 7 9
 */
public class L0301 {
	
	public static String solution(int n, int m, int[] arr1, int[] arr2) {
		StringBuffer answer = new StringBuffer();
		
		int[] arrSum = new int[n+m];
		
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < n+m; i++) {
			if (count1 == n) {
				arrSum[i] = arr2[count2];
				count2++;
				continue;
			}
				
			if (count2 == m) {
				arrSum[i] = arr1[count1];
				count1++;
				continue;
			}
			if (arr1[count1] < arr2[count2]) {
				arrSum[i] = arr1[count1];
				count1++;
			} else {
				arrSum[i] = arr2[count2];
				count2++;
			}
		}
		
		for (int i = 0; i < n+m; i++) {
			if (i!= 0) {
				answer.append(" ");
			}
			answer.append(arrSum[i]);
		}
		
		return answer.toString();
	}
	
	// 강의: two pointers algorithm
	public List<Integer> answer(int n, int m, int[] a, int[] b) {
		List<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		while (p1 < n && p2 < m) {
			if (a[p1] < b[p2]) {
				answer.add(a[p1++]);
			} else {
				answer.add(b[p2++]);
			}
		}
		
		while(p1<n) {
			answer.add(a[p1++]);
		}
		while(p2<m) {
			answer.add(b[p2++]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		int[] arr1 = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr1[i] = sc.nextInt();
		}
		
		sc.nextLine();
		
		int M = sc.nextInt();
		sc.nextLine();
		
		int[] arr2 = new int[M];
		
		for (int i = 0; i < M; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println(solution(N, M, arr1, arr2));
	}

}
