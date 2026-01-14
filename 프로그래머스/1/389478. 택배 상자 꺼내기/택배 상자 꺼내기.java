class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        // 현재 층수 구하기
        int floor = (num / w) + 1;
        if (num % w == 0) {
        	floor -= 1;
        }
        
        while (n >= num) {
        	answer ++;
        	
        	// (현재 층수에서 가장 큰 수 - num) * 2 + 1
        	num += ((floor * w) - num) * 2 + 1;
        	
        	floor ++;
        }
        
        return answer;
    }
}