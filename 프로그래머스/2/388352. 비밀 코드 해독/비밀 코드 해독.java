import java.util.*;

class Solution {
    public static int answer = 0;
    public int solution(int n, int[][] q, int[] ans) {
		List<Integer> code = new ArrayList<Integer>();
        compare(n, q, ans, 0, code);
        int count = answer;
        answer = 0;
        return count;
    }
	
	public void compare(int n, int[][] q, int[] ans, int point, List<Integer> code) {
		if (code.size() == 5) {
			if (possible(q, ans, code)) {
				answer++;
			}
			return;
		}

		for (int i = point; i < n; i++) {
			code.add(i + 1);
			compare(n, q, ans, i + 1, code);
			code.remove(code.size() - 1);
		}
	}
    
	public boolean possible(int[][] q, int[] ans, List<Integer> code) {
		for (int i = 0; i < q.length; i++) {
			int count = 0;
			for (int j = 0; j < q[0].length; j++) {
				for (int k = 0; k < code.size(); k++) {
					if (q[i][j] == code.get(k)) {
						count++;
						break;
					}
				}
			}

			if (count != ans[i]) {
				return false;
			}
		}

		return true;
	}
}