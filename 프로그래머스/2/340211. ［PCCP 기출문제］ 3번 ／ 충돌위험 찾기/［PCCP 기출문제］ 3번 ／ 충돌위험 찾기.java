import java.util.*;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        List<List<int[]>> robots = new ArrayList<List<int[]>>();

        int maxTime = 0;
        for (int i = 0; i < routes.length; i++) {
            List<int[]> moves = move(points, routes[i]);
            robots.add(moves);
            
            if (maxTime < moves.size()) {
                maxTime = moves.size();
            }
        }

        for (int i = 0; i < maxTime; i++) {
            // 충돌확인
            Map<String, Boolean> check = new HashMap<String, Boolean>();
            Map<String, Boolean> collision = new HashMap<String, Boolean>();
            for (int j = 0; j < robots.size(); j++) {
                List<int[]> robot = robots.get(j);

                if (robot.size() <= i) {
                    continue;
                }

                String key = String.format("%d,%d", robot.get(i)[0], robot.get(i)[1]);

                if (check.get(key) != null) {
                    collision.put(key, true);
                    continue;
                }
                check.put(key, true);                
            }

            answer += collision.size();
        }

        return answer;
    }

    private List<int[]> move(int[][] points, int[] route) {
        List<int[]> moves = new ArrayList<int[]>();
        moves.add(points[route[0] - 1].clone());

        for (int i = 0; i < route.length - 1; i++) {
            int[] start = points[route[i] - 1].clone();
            int[] end = points[route[i+1] - 1].clone();

            while ((start[0] != end[0]) || (start[1] != end[1])) {
                if (start[0] > end[0]) {
                    start[0] -= 1;
                } else if (start[0] < end[0]) {
                    start[0] += 1;
                } else if (start[1] > end[1]) {
                    start[1] -= 1;
                } else if (start[1] < end[1]) {
                    start[1] += 1;
                } else {
                    break;
                }

                moves.add(start.clone());
            }
        }
        
        return moves;
    }
}