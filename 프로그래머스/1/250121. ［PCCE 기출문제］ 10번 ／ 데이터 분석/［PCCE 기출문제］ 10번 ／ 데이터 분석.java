import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> pop = new ArrayList<int[]>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        for (int i = 0; i < data.length; i++) {
            if (data[i][map.get(ext)] < val_ext) {
                pop.add(data[i]);
            }
        }
        
        int[][] answer = new int[pop.size()][];
        answer = pop.toArray(answer);
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = 0; j < answer.length -  (i+1); j++) {
                if (answer[j][map.get(sort_by)] > answer[j+1][map.get(sort_by)]) {
                    int[] temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }
        
        return answer;
    }
}