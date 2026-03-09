class Solution {
    public int solution(int n, long l, long r) {
        int answer = 0;
        
        for (long i = l-1; i < r; i++) {
        	answer += search(i);
        }
        return answer;
    }
	
	public static int search(long i) {
		
		if (i % 5 == 2) {
			return 0;
		}
		
		if (i < 5) {
			return 1;
		}
		
		return search(i / 5);
	}
}