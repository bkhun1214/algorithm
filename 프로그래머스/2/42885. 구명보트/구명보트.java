import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int lt = 0;
        int rt = people.length - 1;
        
        while (lt <= rt) {
            if (lt == rt) {
                lt++;
            } else if (people[rt] + people[lt] <= limit) {
                rt--;
                lt++;
            } else {
                rt--;
            }
            answer++;
        }
        
        return answer;
    }
}