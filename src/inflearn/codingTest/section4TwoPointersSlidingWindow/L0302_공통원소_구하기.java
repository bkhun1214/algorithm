package inflearn.codingTest.section4TwoPointersSlidingWindow;

import java.util.*;

/**
 * 2. 공통원소 구하기 
 * 
 * 설명
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 * 
 * 
 * 입력
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 * 
 * 출력
 * 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
 * 
 * 예시 입력 1
 * 5 
 * 1 3 9 5 2 
 * 5 
 * 3 2 5 7 8 
 * 
 * 예시 출력 1
 * 2 3 5
 */
public class L0302_공통원소_구하기 {
	
	public static String solution(int n, int m, int[] arr1, int[] arr2) {
		StringBuffer answer = new StringBuffer();
		
		List<Integer> list = new ArrayList<>();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int count1 = 0;
		int count2 = 0;
		
		while(count1 < n && count2 < m) {
			if (arr1[count1] == arr2[count2]) {
				list.add(arr1[count1]);
				count1++;
				count2++;
			} else if (arr1[count1] < arr2[count2]) {
				count1++;
			} else if (arr1[count1] > arr2[count2]) {
				count2++;
			}
		}
		
		if (count1 == n) {
			while(count2 < m) {
				if (arr1[count1-1] == arr2[count2]) {
					list.add(arr1[count1]);
				} else if (arr1[count1-1] < arr2[count2]) {
					break;
				}
				count2++;
			}
		}
		
		if (count2 == m) {
			while(count1 < n) {
				if (arr1[count1] == arr2[count2-1]) {
					list.add(arr1[count1]);
				} else if (arr1[count1] > arr2[count2-1]) {
					break;
				}
				count1++;
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (i!= 0) {
				answer.append(" ");
			}
			answer.append(list.get(i));
		}
		
		return answer.toString();
	}
	
	// two pointers algorithm
	public ArrayList<Integer> answer(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		int p1=0, p2=0;
		while(p1<n && p2<m){
			if(a[p1]==b[p2]){
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++;
			else p2++;
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
