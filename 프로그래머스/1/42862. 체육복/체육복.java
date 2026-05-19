import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        List<Integer> borrows = new ArrayList<Integer>();
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        
        for (int student : lost) {
            if (reserveList.indexOf(student) != -1) {
                borrows.add(student);
                reserveList.remove(reserveList.indexOf(student));
            }
        }

        for (int borrow : borrows) {
            lostList.remove(lostList.indexOf(borrow));
        }

        Collections.sort(reserveList);

        for (int student : reserveList) {
            if (lostList.indexOf(student - 1) != -1) {
                lostList.remove(lostList.indexOf(student - 1));
            } else if (lostList.indexOf(student + 1) != -1) {
                lostList.remove(lostList.indexOf(student + 1));
            }
        }
        answer = n - lostList.size();
        
        return answer;
    }
}