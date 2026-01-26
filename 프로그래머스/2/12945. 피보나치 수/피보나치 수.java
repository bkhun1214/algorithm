class Solution {
    public static int[] arr = new int[100001];
	
	public int solution(int n) {
		arr[1] = 1;
		arr[2] = 1;
		return fibonacci(n) % 1234567;
	}
	
	public int fibonacci(int n) {
		if (n == 1 || n == 2) {
			
			return arr[n];
		}
		
		if (arr[n-2] == 0) {
			arr[n-2] = fibonacci(n-2);
		}
		
		if (arr[n-1] == 0) {
			arr[n-1] = fibonacci(n-1); 
		}
		
		return (arr[n-1] % 1234567) + (arr[n-2] % 1234567);
	}
}