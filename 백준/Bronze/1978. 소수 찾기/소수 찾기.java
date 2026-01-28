import java.util.*;

public class Main{
    public static int solution(int N, int[] nums) {
        int answer = 0;
        
        for (int num : nums) {
        	if (num == 1) {
        		continue;
        	}
        	
        	if (num == 2) {
        		answer++;
        		continue;
        	}
        	
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        sc.nextLine();
        
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println(solution(N, nums));
    }
}