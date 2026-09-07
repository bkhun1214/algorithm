class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        for (int i = 2; i < number + 1; i++) {
            int temp = 2;
            for (int j=2; j < i/2 + 1; j++) {
                if (i % j == 0) {
                    if (j * j == i || i / j < i / 2 + 1) {
                        temp += 1;
                    } else {
                        temp += 2;
                    }
                    if (temp > limit) {
                        temp = power;
                        break;
                    }
                }
            }
            answer += temp;
        }
        return answer;
    }
}